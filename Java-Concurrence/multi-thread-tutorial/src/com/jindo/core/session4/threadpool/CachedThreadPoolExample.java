package com.jindo.core.session4.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class CachedThreadPoolExample {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i <= 100; i++){
            Runnable worker = new WorkerTempThread(String.valueOf(i));
            executor.execute(worker);
            Thread.sleep(400);
        }


        executor.shutdown();

        while (!executor.isTerminated()){
            // Running...
            System.out.println("Executor is not Terminated");
        }

        System.out.println("Finished all threads");
    }
}
