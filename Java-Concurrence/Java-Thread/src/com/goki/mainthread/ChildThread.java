package com.goki.mainthread;

/**
 * @author ManhKM on 5/16/2022
 * @project Java-Thread
 */
public class ChildThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread");
        }
    }
}
