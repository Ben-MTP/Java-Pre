package com.manhkm.threadpool.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author ManhKM on 4/9/2022
 * @project Java-Thread
 */
public class CallableExample {
    public static void main(String[] args) {
        List<Future<Integer>> list = new ArrayList<>();

        ExecutorService executor = Executors.newFixedThreadPool(5);
        Callable<Integer> callable;
        Future<Integer> future;
        for (int i = 1; i <= 10; i++) {
            callable = new CallableWorker(i);

            // submit Callable tasks to be executed by thread pool
            future = executor.submit(callable);

            // add Future to the list, we can get return value using Future
            list.add(future);
        }

        // shut down the executor service now
        executor.shutdown();

        // Wait until all threads are finish
        while (!executor.isTerminated()) {
            // Running ...
        }

        int sum = 0;
        for (Future<Integer> f : list) {
            try {
                sum += f.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Finished all threads: ");
        System.out.println("Sum all = " + sum);
    }
}
