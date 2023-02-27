package com.core;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ManhKM on 8/13/2022
 * @project map-interface
 */
public class MapInterfaceDemo1 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();     //no String, Integer

        map.put("key1", 10);
        map.put("key2", 20);
        map.put("key3", 30);
        map.put("key4", 40);

        for (Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

}
