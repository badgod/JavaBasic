package com.example.javafx_1;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();

        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        System.out.println("List Collection1 : ");
        System.out.println(collection1);

        System.out.println("New York in Collection : "+ collection1.contains("New York"));

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        System.out.println("\nList collection2 : ");
        System.out.println(collection2);

        ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
        c1.addAll(collection2);

        System.out.println("List c1 : ");
        System.out.println(c1);
    }
}
