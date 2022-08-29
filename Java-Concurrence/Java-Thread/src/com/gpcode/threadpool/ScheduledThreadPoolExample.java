package com.gpcode.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class ScheduledThreadPoolExample {
    public static final int NUM_OF_THREAD = 2;
    public static final int INITIAL_DELAY = 1;  //second
    public static final int DELAY = 3;  //second

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(NUM_OF_THREAD);

        for (int i = 1; i <= 5; i++){
            Runnable worker = new WorkerThread("" + i);
            executor.scheduleWithFixedDelay(worker, INITIAL_DELAY, DELAY, TimeUnit.SECONDS);

            // waits for
        }

    }
}
