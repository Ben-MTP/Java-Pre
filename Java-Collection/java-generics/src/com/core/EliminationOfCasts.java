package com.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ManhKM on 8/23/2022
 * @project java-generics
 */
public class EliminationOfCasts {

    public static void main(String[] args) {

        //demoWithoutGenerics();
        demoWithGenerics();
    }

    private static void demoWithGenerics() {
        List<String> bookTitles = new ArrayList<String>();
        bookTitles.add("Effective Java");
        bookTitles.add("Thinking in Java");
        bookTitles.add("Head First Java");

        Iterator<String> it = bookTitles.iterator();

        while (it.hasNext()){
            System.out.println(it.next());      // different it.next() method
        }
    }

    private static void demoWithoutGenerics() {
        List bookTitles = new ArrayList();

        bookTitles.add("Effective Java");
        bookTitles.add("Thinking in Java");
        bookTitles.add("Head First Java");

        Iterator it = bookTitles.iterator();

        System.out.println("---Data of BookTitles---");
        while (it.hasNext()){
            String nextTitle = (String) it.next();
            System.out.println(nextTitle);
        }
    }

}
