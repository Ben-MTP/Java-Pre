package com.jindo.core.session2;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class NonDaemonThreadTest {

    public static void main(String[] args) throws InterruptedException {
        WorkingThread runnableWorkingThread = new WorkingThread("Thread-01");
        Thread thread1 = new Thread(runnableWorkingThread);

        thread1.start();

        // continue program:
        Thread.sleep(3000);
        System.out.println(">>><<< Finishing Main Program");
    }
}
