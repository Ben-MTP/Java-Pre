package com.jindo.core.session1.exception;

import java.util.Random;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 * @note Thực hành tạo một Thread implement Runnable
 */
public class WorkingThread implements Runnable {

    @Override
    public void run() {
        while (true) {
            processSomething();
        }
    }

    /**
     * Thực hiện nghiệm vụ chính trong hệ thống
     * Thực hiện random một số trong khoảng
     * Nếu nó rơi vào một case chỉ định thì dừng chương trình
     * Nếu có exception sảy ra trong quá trình chạy thì quit
     */
    private void processSomething() {

        Random random = new Random();
        int i = random.nextInt(9_000);
        try {
            System.out.println("[" + i + "] Processing working thread");
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (i == 70) {
            throw new RuntimeException("Giá trị này = 70, không xử lý trong Thread");
        }
    }
}
