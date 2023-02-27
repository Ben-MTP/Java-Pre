package com.o7p.runnable;

/**
 * @author ManhKM on 6/30/2022
 * @project Java-Thread
 */
public class RunnableTest {
    public static void main(String[] args) {
        System.out.println("Main Thread running...");

        Thread thread = new Thread(new RunnableDemo());

        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread stopped...");
    }
}
