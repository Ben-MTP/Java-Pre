package com.jindo.core.session1.thread;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class ThreadDemoTest {

    public static void main(String[] args) {

        System.out.println("Main thread running...");

        ThreadDemo threadDemo1 = new ThreadDemo("Thread-1-HR-Database");
        threadDemo1.start();

        ThreadDemo threadDemo2 = new ThreadDemo("Thread-2-Send-Email");
        threadDemo2.start();

        System.out.println("Main thread stopped!");
    }
}
