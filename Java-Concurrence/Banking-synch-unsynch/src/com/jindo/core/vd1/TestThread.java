package com.jindo.core.vd1;

/**
 * @author ManhKM on 5/10/2022
 * @project Banking-synch-unsynch
 */
public class TestThread {
    public static void main(String[] args) {
        System.out.println("----> Running Test Thread");
        count c = new count();
        Thread t1 = new Thread(new Access("Thread-1", c));
        Thread t2 = new Thread(new Access("Thread-2", c));

        t1.start();
        t2.start();
    }
}
