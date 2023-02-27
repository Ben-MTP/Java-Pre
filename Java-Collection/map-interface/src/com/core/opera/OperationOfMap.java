package com.core.opera;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ManhKM on 8/13/2022
 * @project map-interface
 * -----
 * Operation 1: Adding element
 * Operation 2: Update element of Map
 * Operation 3: Delete element of Map
 * Operation 4: Iterating through the Map
 */
public class OperationOfMap {

    public static void main(String[] args) {
        Map<Integer, String> hm1 = new HashMap<>();
        hm1.put(new Integer(1), "Geeks");
        hm1.put(new Integer(2), "Geeks");
        hm1.put(new Integer(3), "Geeks");

        System.out.println("Initial Map: " + hm1);

        hm1.put(2, "For");

        System.out.println("Updated Map: " + hm1);

        hm1.remove(3);

        System.out.println("After delete element of Map: " + hm1);

        for (Map.Entry item : hm1.entrySet()){
            int key      = (int) item.getKey();
            String value = (String) item.getValue();

            System.out.println(key + ": " + value);
        }
    }

}
