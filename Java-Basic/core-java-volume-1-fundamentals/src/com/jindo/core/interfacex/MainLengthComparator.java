package com.jindo.core.interfacex;

import java.util.Arrays;

/**
 * @author ManhKM on 5/25/2022
 * @project core-java-volume-1-fundamentals
 */
public class MainLengthComparator {
    public static void main(String[] args) {
        Comparator<String> comp = new LengthComparator();
        if(comp.compare("ManhKM", "TB") > 0){
            System.out.println("-----> length -----> OK");
        }

        String[] friends = {"Peter", "Paul", "Mary"};
        Arrays.sort(friends, new LengthComparator());
        for (String item: friends) {
            System.out.print(item + ", ");
        }
    }
}
