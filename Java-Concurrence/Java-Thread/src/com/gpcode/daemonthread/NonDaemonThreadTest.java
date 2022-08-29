package com.gpcode.daemonthread;

/**
 * Object new WorkingThread() -> trong package daemonthread
 * @author ManhKM on 4/5/2022
 * @project Java-Thread
 */
public class NonDaemonThreadTest {
    public static void main(String[] args) {
        Thread dt = null;
        try {
            dt = new Thread(new WorkingThread(), "My Non-Daemon Thread");
            dt.start();

            // continue program:
            Thread.sleep(3000);
            System.out.println("-----> Finishing main program");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
