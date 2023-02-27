package com.core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 8/23/2022
 * @project java-generics
 */
public class DemoGenerics {

    public static void main(String[] args) {
        List<String> listNames = new ArrayList<String>();
        listNames.add("Tom");
        listNames.add("ManhKm");
        listNames.add("Peter");

        String name = listNames.get(1);
        System.out.println(name);
    }

}
