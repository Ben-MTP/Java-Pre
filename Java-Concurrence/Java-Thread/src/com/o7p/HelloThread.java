package com.o7p;

/**
 * @author ManhKM on 6/30/2022
 * @project Java-Thread
 */
public class HelloThread extends Thread{
    @Override
    public void run() {
        int index = 1;

        for (int i = 0; i < 10; i++){
            System.out.println(" - HelloThread running - " + index + " - "+ i);
        }

        try {
            Thread.sleep(1030);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" ----> HelloThread stopped!");
    }
}
