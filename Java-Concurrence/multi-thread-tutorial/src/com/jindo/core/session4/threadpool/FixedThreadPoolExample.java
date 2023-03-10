package com.jindo.core.session4.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class FixedThreadPoolExample {

    public static final int NUM_OF_THREAD = 10;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(NUM_OF_THREAD);
        for (int i = 1; i <= 100; i++) {
            Runnable worker = new WorkerTempThread(String.valueOf(i));
            executor.execute(worker);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
            // Running...
        }

        System.out.println("Finished all threads");
    }
}
