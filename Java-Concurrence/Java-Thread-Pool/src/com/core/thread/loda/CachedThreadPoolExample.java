package com.core.thread.loda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ManhKM on 4/23/2022
 * @project Java-Thread-Pool
 */
public class CachedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for(int i = 0; i < 100; i++){
            executor.execute(new RequestHandler("request-" + i));
        }
        executor.shutdown();

        while (!executor.isTerminated()){
            //
        }
    }
}
