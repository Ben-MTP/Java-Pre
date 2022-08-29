package com.gpcode.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Thực hiện khởi tạo NewFixedThread.
 * Thực hiện tạo ThreadPool có kích thước 5
 * Trong đó tạo ra 10 task công việc vào ThreadPool.
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class FixedThreadPoolExample {
    public static final int NUM_OF_THREAD = 5;
    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(NUM_OF_THREAD);

        for(int i = 1; i <= 10; i++){
            Runnable worker = new WorkerThread(""+i);
            executor.execute(worker);
        }
        executor.shutdown();

        while (!executor.isTerminated()){
            //Running something...
        }
        System.out.println("Finished all threads");


    }
}
