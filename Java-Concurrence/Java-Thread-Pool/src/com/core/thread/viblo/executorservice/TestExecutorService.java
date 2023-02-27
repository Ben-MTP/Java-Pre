package com.core.thread.viblo.executorservice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author ManhKM on 8/11/2022
 * @project Java-Thread-Pool
 */
public class TestExecutorService {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task1";
            }
        });

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task2";
            }
        });

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task3";
            }
        });

        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task3";
            }
        });

        try {
            List<Future<String>> futureList = executorService.invokeAll(callables);
            for (Future<String> future : futureList){
                System.out.println("Future.get = " + future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();

    }
}
