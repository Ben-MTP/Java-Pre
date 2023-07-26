package com.jindo.core.session2;

/**
 * @author ManhKM as [ADMIN]
 * @project multi-thread-tutorial on 7/26/2023-11:36 AM (>_<)/
 * @note
 */
public class NonDaemonThreadTest2 {
    public static void main(String[] args) {
        Thread dt = new Thread(new WorkingThread2(), "My Non-Daemon Thread 2");

        dt.setDaemon(false);
        dt.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread dt2 = new Thread(new WorkingThread2(), "My Daemon Thread 2");

        dt2.setDaemon(true);
        dt2.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(">><< Finishing main program");
    }
}
