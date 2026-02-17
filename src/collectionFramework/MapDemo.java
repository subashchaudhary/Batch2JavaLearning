package collectionFramework;


import java.util.*;

public class MapDemo {

    static void main() {


        // map is a collection of key value pairs ( key, value);

        Map map = new HashMap(); //hashmap

        map.put("name", "John");
        map.put("age", 30);
        map.put("city", "New York");


        System.out.println(map);



        Map<String, Integer> map1 = new HashMap<>(); //hashmap

        map1.put("John", 30);
        map1.put("Ram", 22);
        map1.put("Sita", 49);


        System.out.println(map1);


        //method of map interface
        int value = map1.get("Ram");
        System.out.println(value);


       // map1.remove("Sita");


        map1.replace("John", 30, 39);

        System.out.println(map1);

       Collection<Integer> values = map1.values();

       System.out.println(values);


   //    Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) map1.entrySet();

       for(Map.Entry<String, Integer> e : map1.entrySet()){
           System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
       }

       Set<String> keySet = map1.keySet();

       System.out.println(keySet);


       //LinkedHashMap maintains the order of insertion

         Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

         linkedHashMap.put("John", 30);
         linkedHashMap.put("Ram", 22);
         linkedHashMap.put("Sita", 49);

         System.out.println(linkedHashMap);



         //HashTable is synchronized or thread safe

        Map<String, String> hashTable = new Hashtable<>();

        hashTable.put("name", "John");
        hashTable.put("age", "30");
        hashTable.put("city", "New York");



        System.out.println(hashTable);


    }
}
