package com.gpcode.flow;

/**
 * @author ManhKM on 4/5/2022
 * @project Java-Thread
 */
public class RunnableDemoTest {
    public static void main(String[] args) {
        System.out.println("Main thread running...");

        RunnableDemo R1 = new RunnableDemo("Thread-1-HR-Database");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Thread-2-Send-Email");
        R2.start();

        System.out.println("Main thread stopped!!!");

    }
}
