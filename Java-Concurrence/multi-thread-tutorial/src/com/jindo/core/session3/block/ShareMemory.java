package com.jindo.core.session3.block;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class ShareMemory {

    //synchronized
    public synchronized void printData(String threadName) {
        synchronized (this) {
            for (int i = 1; i <= 20; i++) {
                System.out.println(threadName + ": " + i);
            }
        }

//        for (int i = 1; i <= 20; i++) {
//            System.out.println(threadName + ": " + i);
//        }
    }
}
