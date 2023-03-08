package com.jindo.core.session1.exception;

import java.util.Random;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class WorkingThread implements Runnable {

    @Override
    public void run() {
        while (true) {
            processSomething();
        }
    }

    private void processSomething() {

        Random random = new Random();
        int i = random.nextInt(200);
        try {
            System.out.println("[" + i + "] Processing working thread");
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (i == 70) {
            throw new RuntimeException("Giá trị này = 70, không xủ lý trong Thread");
        }
    }
}
