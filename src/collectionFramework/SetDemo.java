package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    static void main() {




        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        numbers.containsAll(Set.of(10,20));
        numbers.removeAll(Set.of(10,20));





        System.out.println(numbers);



    }
}
