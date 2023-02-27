package com.goki.java2.thread.lession5;

/**
 * @author ManhKM on 7/2/2022
 * @project Java-Thread
 */
public class Main {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        CustomThread t1   = new CustomThread(sharedData, "Thread1");
        CustomThread t2   = new CustomThread(sharedData, "Thread2");
        CustomThread t3   = new CustomThread(sharedData, "Thread3");
        CustomThread t4   = new CustomThread(sharedData, "Thread4");
        CustomThread t5   = new CustomThread(sharedData, "Thread5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
