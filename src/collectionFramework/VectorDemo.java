package collectionFramework;

import java.util.*;

public class VectorDemo {


    public static void main(String[] args) {


        //Vector is synchroiniezed or thread safe

        Vector<Integer> myVector = new Vector<>();


        myVector.add(1);
        myVector.add(2);
        myVector.add(3);

        Iterator<Integer> iterator = myVector.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //arrarylist concurrent modification exception example : (ConcurrentModificationException )

            Vector<Integer> myList = new Vector<>();

            myList.add(1);
            myList.add(2);
            myList.add(5);
            myList.add(3);

            Enumeration<Integer> listIterator = myList.elements();
            while (listIterator.hasMoreElements()){
                Integer number = listIterator.nextElement();
                System.out.println(number);
                if (number == 2){
                    myList.remove(number); //modifying list while iterating
                }
            }



        //example of vector with multiple threads
        //thread 1 --> insert element in vector
        //thread 2 --> read element from vector


        //arraylist is not thread safe but vector is thread safe because of synchronization
        //problem with arrarylist is that if multiple
        // threads are accessing the same arraylist and one thread is modifying
        // the list while another thread is reading from it, it can lead to concurrent modification exception
        // or data inconsistency.



        // Vector uses synchronization to ensure that only one thread can access the vector at a time, which prevents these issues and makes it thread safe.

    }

}
