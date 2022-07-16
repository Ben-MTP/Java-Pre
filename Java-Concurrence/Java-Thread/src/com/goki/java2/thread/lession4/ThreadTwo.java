package com.goki.java2.lession4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ManhKM on 6/30/2022
 * @project Java-Thread
 * -----
 *
 */
public class ThreadTwo extends Thread{
    private String name;

    public ThreadTwo(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(this.name + " >> " + i + " >> " + isAlive());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Logger.getLogger(ThreadTwo.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
