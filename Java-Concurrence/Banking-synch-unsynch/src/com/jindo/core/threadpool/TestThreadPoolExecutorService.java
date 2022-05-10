package com.jindo.core.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 5/10/2022
 * @project Banking-synch-unsynch
 *
 */
public class TestThreadPoolExecutorService {
    public static void main(String[] args) {
        System.out.println("-----> Running TestThreadPoolExecutorService....");
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 100; i++){
            /**
             * Thực hiện submit 100 task lên Queue/ExecutorService:
             */
            pool.submit(new Run(i));
        }
        try {
            pool.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pool.shutdown();
    }
}
