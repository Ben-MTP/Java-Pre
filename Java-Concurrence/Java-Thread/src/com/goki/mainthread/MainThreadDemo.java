package com.goki.mainthread;

/**
 * @author ManhKM on 5/16/2022
 * @project Java-Thread
 */
public class MainThreadDemo extends Thread{
    public static void main(String[] args) {
        // getting reference to Main thread
        Thread t = Thread.currentThread();
        // getting name of Main thread
        System.out.println("Current thread: " + t.getName());
        // doi ten thread
        t.setName("Shareprogramming.net");
        System.out.println("After name change: " + t.getName());
        // Kiem tra do uu tien cua main thread
        System.out.println("Main thread priority: "+ t.getPriority());

        // thay doi gia tri do uu tien cua main thread
        t.setPriority(MAX_PRIORITY);
        System.out.println("Main thread new priority: "+ t.getPriority());
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }

        // Khoi tao childthread con cua main thread
        ChildThread ct = new ChildThread();
        System.out.println("Child thread priority: "+ ct.getPriority());
        ct.setPriority(MIN_PRIORITY);
        System.out.println("Child thread new priority: "+ ct.getPriority());
        ct.start();
    }
}
