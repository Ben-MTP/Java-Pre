package com.msoft.core.singlethread;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ManhKM on 11/25/2022
 * @project concurrent-modification-exception
 */
public class AvoidConcurrentModificationExceptionMap {

    public static void main(String[] args) {

        Map<String , String> myMap = new ConcurrentHashMap<String, String>();
        for (int i = 1; i <= 3; i++){
            myMap.put(String.valueOf(i), String.valueOf(i));
        }

        Iterator<String> it1 = myMap.keySet().iterator();
        while (it1.hasNext()){
            String key = it1.next();
            System.out.println("Map Value: " + myMap.get(key));
            if (key.equals("1")){
                myMap.remove("3");
                myMap.put("4", "4");
                myMap.put("5", "5");
            }
        }
        System.out.println("Map Size: " + myMap.size());
    }
}
