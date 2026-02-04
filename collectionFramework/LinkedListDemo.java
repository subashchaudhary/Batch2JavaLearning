package collectionFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {


    static void main() {



        LinkedList list = new LinkedList();

       // List list2 = new LinkedList();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        var iterator =  list.listIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        list.peek();

        //methods available in linked list



        list.add(5, 29); //index wise add

        list.addFirst(55); //add at first

        list.addLast(99); //add at last

        list.poll(); //removes first element
        list.pollFirst(); //removes first element

        list.push(5); //stack

        list.pop();



        System.out.println(list);


    }
}
