package com.gpcode.threadpool;

/**
 * Class khởi tạo thread
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class WorkerThread implements Runnable{

    private String task;
    public WorkerThread(String s){
        this.task = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Stating. Task = " + task);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " Finished.");
    }

    /**
     * Thực hiện logic -> dừng khoảng 2s mỗi lần chạy
     */
    private void processCommand() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
