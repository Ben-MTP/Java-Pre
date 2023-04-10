package com.jindo.core.session5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author ManhKM on 3/10/2023
 * @project multi-thread-tutorial
 */
public class CallableExample {

    public static void main(String[] args) {

        // create a list to hold the Future object associated with callable
        List<Future<Integer>> list = new ArrayList<>();

        ExecutorService executor = Executors.newFixedThreadPool(10);

        Callable<Integer> callable;

        Future<Integer> future;

        for (int i = 0; i <= 999999; i++) {
            callable = new CallableWorker(i);
            future = executor.submit(callable);
            list.add(future);
        }

        executor.shutdown();

        while (!executor.isTerminated()){
            //Running something
        }

        int sum = 0;
        for (Future<Integer> f : list){
            try {
                sum += f.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Finished all threads: ");
        System.out.println("Sum all = " + sum);
    }
}
