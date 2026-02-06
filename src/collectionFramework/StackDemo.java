package collectionFramework;

import java.util.Stack;

public class StackDemo {


    public static void main(String[] args){


        //Stack is LIFO data structure

        //first inserted that is last processed


        Stack<Integer> stack = new java.util.Stack<>(); //object creation

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Popped element: " + stack.pop()); //remove element form top

        System.out.println("Stack after pop: " + stack);

        System.out.println("Top element: " + stack.peek()); //get top elemet without removing

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.addFirst(44);
        System.out.println("Stack: " + stack);



    }
}
