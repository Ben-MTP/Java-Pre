package com.manhkm.sync;

/**
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class ShareMemory {
    public synchronized void printData(String threadName){
        for (int i = 1; i <= 5; i++){
            System.out.println(threadName + ": " + i);
        }
    }
}
