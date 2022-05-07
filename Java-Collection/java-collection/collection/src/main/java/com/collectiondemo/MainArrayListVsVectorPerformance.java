package com.collectiondemo;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author ManhKM on 2/14/2022
 * @project Java-Collection
 */
public class MainArrayListVsVectorPerformance {
    static Logger logger = Logger.getLogger(MainArrayListVsVectorPerformance.class);
    static int n = 100000;
    public static void main(String[] args) {
        arrayListVsVectorSingle();
    }
    public static void arrayListVsVectorSingle(){
        List arrayList = new ArrayList();
        Vector vector = new Vector();
        System.out.println("==== Add ====");
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        System.out.println("ArrayList: " + (System.nanoTime() - start)/1000000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            vector.add(i);
        }
        System.out.println("Vector   : " + (System.nanoTime() - start)/1000000.0 + " ms");

        System.out.println("==== Get ====");
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.get(i);
        }
        System.out.println("ArrayList: " + (System.nanoTime() - start)/1000000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            vector.get(i);
        }
        System.out.println("Vector   : " + (System.nanoTime() - start)/1000000.0 + " ms");
    }
}
