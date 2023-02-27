package com.msoft.core.singlethread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author ManhKM on 11/25/2022
 * @project concurrent-modification-exception
 */
public class AvoidConcurrentModificationExceptionArrayListSubList {

    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
        List<String> names = new CopyOnWriteArrayList<>();

        names.add("Java");
        names.add("PHP");
        names.add("SQL");
        names.add("Angular 12");

        List<String> first2Names = names.subList(0, 2);

        System.out.println(names + ", " + first2Names);

        names.set(1, "JavaScript");

        System.out.println(names + ", " + first2Names);

        names.add("NodeJS");
        System.out.println(names + ", " + first2Names);
    }
}
