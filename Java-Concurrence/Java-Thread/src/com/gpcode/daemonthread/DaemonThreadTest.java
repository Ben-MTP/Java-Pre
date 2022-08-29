package com.gpcode.daemonthread;

/**
 * Trong class: DaemonThreadTest -> MainThread
 *      -> Thread dt -> create MainThread.
 * @author ManhKM on 4/7/2022
 * @project Java-Thread
 */
public class DaemonThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread dt = new Thread(new WorkingThread(), "My Daemon Thread");
        dt.setDaemon(true);
        dt.start();

        /**
         * Coding something
         */
        Thread.sleep(3000);
        System.out.println("-----> Finishing main program....");
    }
}
