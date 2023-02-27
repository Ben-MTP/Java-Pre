package com.core;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author ManhKM on 8/13/2022
 * @project map-interface
 */
public class TreeMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        map.put("key1", 1000);
        map.put("key2", 9000);
        map.put("key3", 1000);
        map.put("key4", 5000);

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
