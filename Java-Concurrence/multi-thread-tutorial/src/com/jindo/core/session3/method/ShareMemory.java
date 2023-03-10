package com.jindo.core.session3.method;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class ShareMemory {

    //synchronized
    public synchronized void printData(String threadName){
        for (int i = 1; i <= 20; i++){
            System.out.println(threadName + ": " + i);
        }
    }
}
