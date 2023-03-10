package com.jindo.core.session3.staticmethod;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class ShareMemory {

    //synchronized
    public static synchronized void printData(String threadName){
        for (int i = 1; i <= 20; i++){
            System.out.println(threadName + ": " + i);
        }
    }
}
