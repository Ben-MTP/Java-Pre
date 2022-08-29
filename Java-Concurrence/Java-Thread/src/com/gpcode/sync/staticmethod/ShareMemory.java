package com.gpcode.sync.staticmethod;

/**
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class ShareMemory {
    public static synchronized void printData(String threadName){
        for (int i = 1; i <=5; i++){
            System.out.println(threadName + ": " + i);
        }
    }
}
