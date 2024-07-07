package main.java.org.example;

import java.util.*;

public class TestHashmaps {

    HashMap<Integer, String> myMap = new LinkedHashMap<>();

    List<MyObject> myList = new LinkedList<>();
    HashMap<Integer, MyObject> myMap2 = new LinkedHashMap<>();

    public void myTest() {
        myMap.put(4, "four");
        myMap.put(5, "one");
        myMap.put(7, "two");
        myMap.put(8, "three");

        //MyObject uno = new MyObject("100", "uno");
        //MyObject dos = new MyObject("150", "dos");
        //myList.add(uno);
        //myList.add(dos);

        myList.add(new MyObject(100, "uno"));
        myList.add(new MyObject(200, "dos"));
        myList.add(new MyObject(300, "three"));
        myList.add(new MyObject(400, "four"));

        // myMap.forEach((k,v) -> System.out.println(k + " - " + v));

        myList.forEach((item) -> {

            myMap.forEach((k, v) -> {
                if (v.equals(item.getName())) {
                    myMap2.put(item.getCode(), item);
                }
            });

            //if (myMap.values().contains(item.getCode())) {
            //    myMap2.put(k.item)
            //}

            // myList.add(k, new MyObject("23" + k, v));
            //myMap2.put(k, new MyObject("23" + k, v));
        });

        // myList.forEach(System.out::println);
        List<MyObject> myListOrdered = new LinkedList<>(myMap2.values());


        myListOrdered.forEach(i -> {
            System.out.println(i.getCode() + " - " + i.getName());
        });
    }

}
