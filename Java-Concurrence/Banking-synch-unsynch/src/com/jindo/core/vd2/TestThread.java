package com.jindo.core.vd2;

/**
 * @author ManhKM on 5/10/2022
 * @project Banking-synch-unsynch
 */
public class TestThread {
    public static void main(String[] args) {
        System.out.println("----> Running Test-Thread...");
        MyThread t1 = new MyThread("Thread 1_1", 1);
        MyThread t2 = new MyThread("Thread 1_2", 10);
        MyThread t3 = new MyThread("Thread 1_3", 100);

        t1.start();
        t2.start();
        t3.start();
    }
}
