package main.java.org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
         */

        List<String> listString = new ArrayList<>();
        listString.add("100");
        listString.add("120");
        listString.add("150");

        List<StringOrders> ordenada = getStringOrders(listString);

        System.out.println("Hola");
        // System.out.println(ordenada.size());
        // ordenada.forEach(System.out::println);

        ordenada.forEach(i -> System.out.println(i.getCode()));

       /*
       Stream<String> streamOfArray = Stream.of("a", "b", "c");

        List<String> elements =
                Stream.of("a", "b", "c").filter(element -> element.contains("b"))
                        .collect(Collectors.toList());
        Optional<String> anyElement = elements.stream().findAny();
        Optional<String> firstElement = elements.stream().findFirst();
        */

        TestHashmaps testHashmaps = new TestHashmaps();
        testHashmaps.myTest();
    }

    private static List<StringOrders> getStringOrders(List<String> listString) {
        MyObject uno = new MyObject(100, "uno");
        MyObject dos = new MyObject(150, "dos");

        List<MyObject> misObjetos = new ArrayList<>();
        misObjetos.add(uno);
        misObjetos.add(dos);

        List<StringOrders> listStringOrder = new ArrayList<>();
        for (int i = 0; i < listString.size(); i++) {
            // listStringOrder.put(i, listString.get(i));
            StringOrders stO = new StringOrders(i, listString.get(i));
            listStringOrder.add(stO);
        }

        List<StringOrders> ordenada = new ArrayList<>();

        listStringOrder.forEach(
                i -> {
                    System.out.println(listString.indexOf(i.getCode()));

                    ordenada.add(listString.indexOf(i.getCode()), i);
                }
        );
        return ordenada;
    }
}