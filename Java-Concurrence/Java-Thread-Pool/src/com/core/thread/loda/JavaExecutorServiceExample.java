package com.core.thread.loda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ManhKM on 5/9/2022
 * @project Java-Thread-Pool
 *
 * https://jenkov.com/tutorials/java-util-concurrent/executorservice.html#task-delegation
 *
 */
public class JavaExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Không đồng bộ task");
            }
        });
        executorService.shutdown();
    }
}
