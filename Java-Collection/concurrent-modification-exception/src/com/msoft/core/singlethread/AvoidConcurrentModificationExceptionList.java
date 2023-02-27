package com.msoft.core.singlethread;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author ManhKM on 11/25/2022
 * @project concurrent-modification-exception
 */
public class AvoidConcurrentModificationExceptionList {

    public static void main(String[] args) {
        List<String> myList = new CopyOnWriteArrayList<>();

        for (int i = 1; i <= 5; i++){
            myList.add(String.valueOf(i));
        }

        Iterator<String> it = myList.iterator();
        while (it.hasNext()){
            String value = it.next();
            System.out.println("List Value: " + value);
            if(value.equals("3")){
                myList.remove("4");
                myList.add("6");
                myList.add("7");
            }
        }

        System.out.println("List size: " + myList.size());
    }
}
