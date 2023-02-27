package com.core;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ManhKM on 8/13/2022
 * @project map-interface
 */
public class MapInterfaceDemo {

    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("a", new Integer(100));
        hm.put("b", new Integer(100));
        hm.put("c", new Integer(100));
        hm.put("d", new Integer(100));

        for(Map.Entry<String, Integer> me : hm.entrySet()){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
