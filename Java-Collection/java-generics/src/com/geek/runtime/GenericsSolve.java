package com.geek.runtime;

import java.util.ArrayList;

/**
 * @author ManhKM on 8/24/2022
 * @project java-generics
 */
public class GenericsSolve {

    public static void main(String[] args) {

        // Creating a an ArrayList with String specified:
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Khổng");
        arrayList.add("Minh");
        arrayList.add("Mạnh");

        arrayList.add(String.valueOf(100));
        arrayList.add(String.valueOf(3.14));
        arrayList.add(String.valueOf(10L));

        arrayList.get(0);
        arrayList.get(1);
        arrayList.get(2);
        arrayList.get(3);
        arrayList.get(4);
        arrayList.get(5);
    }
}
