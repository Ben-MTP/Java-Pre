package com.core.thread.loda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ManhKM on 4/23/2022
 * @project Java-Thread-Pool
 */
public class SingleThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        /**
         * Giả sử có 100 request tới cùng một lúc
         * Mỗi name-request -> format: request-1,...
         */
        for (int i = 0; i < 100; i++){
            executor.execute(new RequestHandler("request-"+i));
        }
        executor.shutdown();

        while (!executor.isTerminated()){
            // Chờ xử lý hết các request còn chờ trong QUEUE
        }
    }
}
