package com.jindo.core.session2;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class DaemonThreadTest {

    public static void main(String[] args) throws InterruptedException {
        WorkingThread runnableWorkingThread = new WorkingThread("Thread-01");
        runnableWorkingThread.start();

        // continue program:
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName());
        System.out.println(">>><<< Finishing Main Program");
    }
}
