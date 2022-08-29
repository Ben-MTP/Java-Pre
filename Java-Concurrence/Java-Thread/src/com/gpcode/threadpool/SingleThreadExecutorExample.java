package com.gpcode.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class SingleThreadExecutorExample {
    public static void main(String[] args) {
        /**
         * Tạo ra ThreadPool
         */
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 10; i++){
            Runnable worker = new WorkerThread(i+"");
            executor.execute(worker);
        }

        executor.shutdown();
        while(!executor.isTerminated()){
//            System.out.println("Running...");
        }
        System.out.println("Finished all threads");
    }
}
