package com.core.thread.viblo.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author ManhKM on 8/11/2022
 * @project Java-Thread-Pool
 */
public class TestFuture {
    public static ExecutorService executorService = Executors.newFixedThreadPool(5);

    public static <T> void main(String[] args) {
        Future<T> future = (Future<T>) executorService.submit(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task");
            }
        });

        try {
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
