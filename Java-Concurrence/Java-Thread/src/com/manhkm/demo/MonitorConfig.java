package com.manhkm.demo;

/**
 * @author ManhKM on 3/7/2022
 * @project Java-Thread
 */
public class MonitorConfig implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println("## Running...");
        }
    }
}
