package com.core.thread.viblo.executorservice;

/**
 * @author ManhKM on 8/11/2022
 * @project Java-Thread-Pool
 * -----
 * Định nghĩa các các Task, job cần phải làm, thực hiện trong module.
 */
public class Task implements Runnable{

    int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Tiến trình đang được thưc thi " + id);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("     Tiến trình đã được thực thi " + id);
    }
}
