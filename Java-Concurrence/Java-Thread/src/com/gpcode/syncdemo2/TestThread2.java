package com.gpcode.syncdemo2;

/**
 * @author ManhKM on 3/8/2022
 * @project Java-Thread
 * Tham khảo: https://codelearn.io/sharing/dong-bo-va-bat-dong-bo-trong-java
 *
 */
public class TestThread2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1_1", 1);
        MyThread t2 = new MyThread("Thread 1_2", 10);
        MyThread t3 = new MyThread("Thread 1_3", 100);

        t1.start();
        t2.start();
        t3.start();
    }
}
