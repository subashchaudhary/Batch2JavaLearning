package collectionFramework;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

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

    }

}
