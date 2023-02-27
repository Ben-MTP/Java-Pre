package com.core;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ManhKM on 8/13/2022
 * @project map-interface
 */
public class CheckOutOfMemHashMap {

    public static void main(String[] args) {
        Map<String, Map<String, String>> serviceCmds = new HashMap<>();
        String data = "If you encode the integers as String, and we're talking maybe 6 digit numbers, that is likely 24 bytes for the underlying ";
        Map<String, String> item = new HashMap<>();
        long key = 1;
        while (1 < 2){
            key = key * 2;
            System.out.println(key);

//            item.put(String.valueOf(key), data);
//            System.out.println(item);
//
//            serviceCmds.put(String.valueOf(key), item);
//            System.out.println(serviceCmds);
        }
    }

}
