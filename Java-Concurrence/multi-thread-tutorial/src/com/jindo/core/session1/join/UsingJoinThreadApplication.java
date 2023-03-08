package com.jindo.core.session1.join;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class UsingJoinThreadApplication {

    public static void main(String[] args) throws InterruptedException {
        UsingJoinThreadDemo threadDemo1 = new UsingJoinThreadDemo("Thread-01");
        UsingJoinThreadDemo threadDemo2 = new UsingJoinThreadDemo("Thread-02");

        threadDemo1.start();
        threadDemo1.join();
        threadDemo2.start();
        System.out.println("Main Thread Finished");
    }
}
