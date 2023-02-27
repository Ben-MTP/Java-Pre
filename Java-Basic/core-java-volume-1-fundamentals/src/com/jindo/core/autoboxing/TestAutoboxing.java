package com.jindo.core.autoboxing;

import java.util.ArrayList;

/**
 * @author ManhKM on 5/21/2022
 * @project core-java-volume-1-fundamentals
 * -----
 * Autoboxing: list.add(Integer.valueOf(3))
 * list.get(i).intValue();
 * int x = Integer.parseInt(s)
 *
 */
public class TestAutoboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(Integer.valueOf(19));

        for (int a: list) {
            System.out.println(a);
        }
    }
}
