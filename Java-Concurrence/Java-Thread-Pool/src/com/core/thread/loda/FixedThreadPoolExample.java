package com.core.thread.loda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Thực hành việc: FixedThreadPoolExample
 *      size: 5
 * @author ManhKM on 4/23/2022
 * @project Java-Thread-Pool
 */
public class FixedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        /**
         * Khởi tạo một 100 request tới cùng một lúc
         */
        for(int i = 0; i < 100; i++){
            executor.execute(new RequestHandler("request-" + i));
        }
        executor.shutdown();    // Không cho threadPool nhận thêm request vào nữa

        while(!executor.isTerminated()){
            //
        }
    }
}
