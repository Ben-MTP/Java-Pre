package com.manhkm.sync.block;

/**
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class ShareMemory {
    public void printData(String threadName){
        synchronized (this){
            for(int i = 0; i <= 5; i++){
                System.out.println(threadName + ": " + i);
            }
        }
    }
}
