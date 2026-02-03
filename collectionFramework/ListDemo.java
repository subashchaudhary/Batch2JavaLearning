package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {


    static void main() {


        Iterable iterable;

        Collection collection;

        int []nums = new int[5]; //fixed sized

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 1;
        nums[3] = 2;
        nums[4] = 1;
      //  nums[5] = 9;  //not possible due to fixed size of 5;



        List list = new ArrayList(); //list of type arraylist


        //add element to list of integer type
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add("Java");
        list.add(true);
        Student student = new Student();

        list.add(student);

        list.add(0, "Java");


//        for(int i=0; i< list.size(); i++) {
//
//           System.out.println(list.get(i).toString());
//        }

        // methods avaialbe in list interface


        ArrayList arrayList = new ArrayList();

        arrayList.add(1); // adding element
        arrayList.remove(0); // removing element at index 0


        arrayList.add("Java");

        System.out.println(arrayList.get(0)); //get element at index 0
        System.out.println(arrayList.size()); //size of the arrarylist


        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(22);
        arrayList1.add(55);
        arrayList.addAll(arrayList1);
        System.out.println(arrayList.size()); //size after adding all elements from arraylist1

       // arrayList.(arrayList1);

      //  arrayList.clear();
        System.out.println(arrayList.size());

        boolean empty = arrayList.isEmpty();

        System.out.println(empty);

        arrayList.remove("Java");

        arrayList.
        System.out.println("program terminated");



    }
}


class Student {

}
