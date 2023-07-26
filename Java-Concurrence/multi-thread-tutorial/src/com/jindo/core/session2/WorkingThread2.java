package com.jindo.core.session2;

/**
 * @author ManhKM as [ADMIN]
 * @project multi-thread-tutorial on 7/26/2023-11:34 AM (>_<)/
 * @note Thực hiện một luồng cơ bản
 */
public class WorkingThread2 implements Runnable {
    @Override
    public void run() {
        while (true) {
            processSomething();
        }
    }

    private void processSomething() {
        try {
            System.out.println("Processing working thread");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
