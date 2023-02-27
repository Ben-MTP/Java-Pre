package com.core;

/**
 * @author ManhKM on 8/10/2022
 * @project java-runnable
 */
public class App {

    public static void main(String[] args) {
        Thread.currentThread().setName("Thread-main-of-java-runnable");
        System.out.println("Main thread is - " +
                Thread.currentThread().getName() + "\n");

        Runnable runnable1 = new RunnableImpl("A", 50);
        Thread task = new Thread(runnable1);
        task.setName("Thread-A");

        Runnable runnable2 = new RunnableImpl("B", 100);
        Thread task1 = new Thread(runnable2);
        task1.setName("Thread-B");

        task.start();

        task1.start();

        System.out.println("---THE END---");
    }
}
