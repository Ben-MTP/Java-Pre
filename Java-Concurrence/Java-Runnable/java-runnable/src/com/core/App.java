package com.core;

/**
 * @author ManhKM on 8/10/2022
 * @project java-runnable
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Main thread is - " +
            Thread.currentThread().getName());

        for(int i = 0; i < 1000; i++){
            Thread thread1 = new Thread(new RunnableImpl());
            thread1.start();
        }
    }
}
