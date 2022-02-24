package com.multithread;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 2/14/2022
 * @project Java-Collection
 */
public class MultiThread {
    static Logger logger = Logger.getLogger(MultiThread.class);

    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List vector = new Vector();

        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new CalRunnable(arrayList));
        }
        shutdownAndAwaitTermination(executorService);
        System.out.println("ArrayList: " + CalRunnable.time/1000000.0 + " ms");

        executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        CalRunnable.time = 0;
        for (int i = 0; i < 10; i++) {
            executorService.execute(new CalRunnable(vector));
        }
        shutdownAndAwaitTermination(executorService);
        System.out.println("Vector   : " + CalRunnable.time/1000000.0 + " ms");
    }

    static void shutdownAndAwaitTermination(ThreadPoolExecutor pool) {
        pool.shutdown();
        try {
            if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
                pool.shutdownNow();
                if (!pool.awaitTermination(60, TimeUnit.SECONDS))
                    System.err.println("Pool did not terminate");
            }
        } catch (Exception e) {
        }
    }
}
class CalRunnable implements Runnable {
    static long time = 0;
    List lst;
    public CalRunnable(List lst){
        this.lst = lst;
    }
    @Override
    public void run() {
        long time = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            lst.add(i);
        }
        CalRunnable.time += (System.nanoTime() - time);
    }
}