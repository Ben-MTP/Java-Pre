package com.goki;

/**
 * @author ManhKM on 4/11/2022
 * @project Java-Thread
 */
public class Thread2 extends Thread{

    private String threadName;

    public Thread2(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(this.threadName + " >>> " + i);
        }
    }
}
