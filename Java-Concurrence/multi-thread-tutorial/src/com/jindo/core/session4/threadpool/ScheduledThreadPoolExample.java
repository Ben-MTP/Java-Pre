package com.jindo.core.session4.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 3/10/2023
 * @project multi-thread-tutorial
 */
public class ScheduledThreadPoolExample {

    public static final int NUM_OF_THREAD = 10;
    public static final int INITIAL_DELAY = 1;  // second
    public static final int DELAY = 3;  //second

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(NUM_OF_THREAD);

        for (int i = 1; i <= 500; i++){
            Runnable worker = new WorkerTempThread(String.valueOf(i));
            executor.scheduleWithFixedDelay(worker, INITIAL_DELAY, DELAY, TimeUnit.SECONDS);
        }

        // wait for termination for 10 seconds only:
        executor.awaitTermination(10, TimeUnit.SECONDS);

        executor.shutdown();

        while (!executor.isTerminated()){
            // Running something

        }

        System.out.println("Finished all threads");
    }
}
