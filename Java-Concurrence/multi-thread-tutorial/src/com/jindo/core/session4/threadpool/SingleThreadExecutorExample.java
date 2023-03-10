package com.jindo.core.session4.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class SingleThreadExecutorExample {

    public static void main(String[] args) {

        /**
         * Khi này nên hiểu rằng hệ thống tự động tạo một SingleThread thôi
         * Còn Runnable ở đây coi như Task cần thực hiện
         * Một Runnable tương đương với 1 task
         */
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 10; i++) {
            Runnable worker = new WorkerTempThread(String.valueOf(i));
            executor.execute(worker);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
            //Running...
        }
        System.out.println("Finished all threads");
    }
}
