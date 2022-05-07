package com.collectiondemo;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * logger.info() --> System.out.println()
 * @author ManhKM on 2/14/2022
 * @project Java-Collection
 */
public class MainArrayListVsLinkedListPerformance {
    static Logger logger = Logger.getLogger(MainArrayListVsLinkedListPerformance.class);
    static int n = 100000;
    public static void main(String[] args) {
        arrayListVsLinkedList();
    }

    private static void arrayListVsLinkedList() {
        Integer[] array = new Integer[n];
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();

        System.out.println("==== Add ====");
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        System.out.println("Array     : " + (System.nanoTime() - start)/1000000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        System.out.println("ArrayList : " + (System.nanoTime() - start)/1000000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        System.out.println("LinkedList: " + (System.nanoTime() - start)/1000000.0 + " ms");

        System.out.println("==== Get ====");
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            Integer x = array[i];
        }
        System.out.println("Array loop index         : " + (System.nanoTime() - start)/1000000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.get(i);
        }
        System.out.println("ArrayList loop index     : " + (System.nanoTime() - start)/1000000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.get(i);
        }
        System.out.println("LinkedList loop index    : " + (System.nanoTime() - start)/1000000.0 + " ms");

        start = System.nanoTime();
        for (Object item : arrayList) {
            Object x = item;
        }
        System.out.println("ArrayList loop interator : " + (System.nanoTime() - start)/1000000.0 + " ms");

        start = System.nanoTime();
        for (Object item : linkedList) {
            Object x = item;
        }
        System.out.println("LinkedList loop interator: " + (System.nanoTime() - start)/1000000.0 + " ms");

        System.out.println("==== Remove ====");
        start = System.nanoTime();
        for (int i = 9999; i >=0; i--) {
            arrayList.remove(i);
        }
        System.out.println("ArrayList : " + (System.nanoTime() - start)/1000000.0 + " ms");

        start = System.nanoTime();
        for (int i = 9999; i >=0; i--) {
            linkedList.remove(i);
        }
        System.out.println("LinkedList: " + (System.nanoTime() - start)/1000000.0 + " ms");
    }
}
