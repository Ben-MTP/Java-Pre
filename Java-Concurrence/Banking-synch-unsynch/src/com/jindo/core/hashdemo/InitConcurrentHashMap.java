package com.jindo.core.hashdemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ManhKM on 5/10/2022
 * @project Banking-synch-unsynch
 * -----
 * Khởi tạo ConcurrentHashMap trong Java
 */
public class InitConcurrentHashMap {
    public static void main(String[] args) {
        // HashTable:
        Map<String, String> normalMap = new Hashtable<String, String>();

        // method .synchronizedMap
        Map<String, String> synchronizedHashMap = Collections.synchronizedMap(new HashMap<String, String>());

        // ConcurrentHashMap
        Map<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();

    }
}
