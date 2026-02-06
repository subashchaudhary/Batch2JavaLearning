package collectionFramework;

import java.util.*;

public class QueueDemo {


    static void main(String[] args) {


        //DQUEUE

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.add(50);
        deque.add(40);

        System.out.println("Elements in Dqueue");
        Iterator<Integer> dqueIterator = deque.iterator();
        while (dqueIterator.hasNext()){
            System.out.print(" "+dqueIterator.next());
        }

        deque.addFirst(30);
        deque.addLast(90);

        System.out.println("\n After add in first and last in Dqueue \n ");
        for( Integer i : deque){
            System.out.print(" " + i);
        }

        //QUEUE
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(50);
        queue.add(40);


        System.out.println("\n\n");
        Iterator<Integer> queueIterator = queue.iterator();
        while (queueIterator.hasNext()){
            System.out.print(" "+queueIterator.next());
        }

        queue.remove();
        System.out.println("\n peak element: " + queue.peek());

        System.out.println("\n After removing elements");

        for(Integer n : queue){
            System.out.print(" "+ n);
        }

        System.out.println("\n poll element: " + queue.poll());

        for(Integer n : queue){
            System.out.print(" "+ n);
        }
    }
}
