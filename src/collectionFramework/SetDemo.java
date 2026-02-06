package collectionFramework;

import oop.abstracion.SmartPhone;

import java.util.*;

public class SetDemo {

    static void main() {


       //Set in java

        Set<Integer> mySet = new HashSet<>();
        mySet.add(4);
        mySet.add(11);

        mySet.add(4);

        //to get size
        int len = mySet.size();

        Iterator<Integer> setIterator = mySet.iterator();


        //print
        while (setIterator.hasNext()){
            System.out.println(setIterator.next());
        }

        //check if preset

        boolean isPresent = mySet.contains(4);

        Set<Integer> anotherSet = new HashSet<>();
        anotherSet.add(5);
        anotherSet.add(100);
        //all another set
        mySet.addAll(anotherSet);


       //remove an element from set
        mySet.remove(100);


        //LinkHashSet


        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("rectangle");
        hashSet.add("circle");
        hashSet.add("square");


        //get last element and first element
        String ele = hashSet.getFirst();
        System.out.println(ele);
        String lastEle = hashSet.getLast();
        System.out.println(lastEle);


       SequencedSet<String> reversedSet = hashSet.reversed();

       Iterator<String> reverseIterator = reversedSet.iterator();

        System.out.println("Reversed Set\n");
       while (reverseIterator.hasNext()){
           System.out.println(reverseIterator.next());
       }

        //Sorted Set
        SortedSet<SmartPhone> sortedSet = new TreeSet<>(new Comparator<SmartPhone>() {
            @Override
            public int compare( SmartPhone o1, SmartPhone o2) {
                return o2.getRamSize().compareTo(o1.getRamSize());
            }
        });

       SmartPhone s1 = new SmartPhone();
       s1.setRamSize(8);
       SmartPhone s2 = new SmartPhone();
       s2.setRamSize(2);

       sortedSet.add(s1);
       sortedSet.add(s2);



        System.out.println("sorted Set Example \n");
        Iterator<SmartPhone> sortedIter = sortedSet.iterator();
       while (sortedIter.hasNext()) {
           System.out.println(sortedIter.next());
       }




        sortedSet.first();








    }
}
