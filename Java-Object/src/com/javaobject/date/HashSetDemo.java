package com.javaobject.date;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ManhKM on 3/7/2022
 * @project Java-Object
 */
public class HashSetDemo {
    private static Set<String> listKeyIgnore = new HashSet<>();
    public static void main(String[] args) {
        listKeyIgnore.add("ManhKM");
        listKeyIgnore.add("TrangTT");
        listKeyIgnore.add("HaVT");
        listKeyIgnore.add("TrangTT");
        listKeyIgnore.add("TrangTT");
        for (String item: listKeyIgnore) {
            System.out.println(item);
        }
    }
}
