package com.core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 8/23/2022
 * @project java-generics
 */
public class DemoWithoutGenerics {

    public static void main(String[] args) {
        List listNames = new ArrayList();   // code without generics:
        listNames.add("Tom");
        listNames.add("ManhKM1");
        listNames.add("Peter");

        String name2 = (String) listNames.get(1);   // casting object into String
        System.out.println(name2);


    }

}
