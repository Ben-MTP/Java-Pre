package com.core;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ManhKM on 9/19/2022
 * @project concurrent-hashmap
 */
public class ClientMap {

    public static void main(String[] args) {

        // Hashtable:
        Map<String, String> normalMap = new Hashtable<String, String>();

        // synchronizedMap:
        Map<String, String> synchronizedHashMap = Collections.synchronizedMap(new HashMap<String, String>());

        // ConcurrentHashMap:
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();

    }
}
