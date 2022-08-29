package com.gpcode.daemonthread;

/**
 * @author ManhKM on 4/5/2022
 * @project Java-Thread
 */
public class WorkingThread implements Runnable{

    @Override
    public void run() {
        while(true){
            processSomething();
        }
    }

    /**
     * Thực hiện logic trong khi chạy tiến trình
     * Sleep() -> dùng cho việc tạm dừng thread trong một khoảng thời gian.
     */
    private void processSomething() {
        try {
            System.out.println("Processing working thread");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
