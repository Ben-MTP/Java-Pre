package com.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 9/19/2022
 * @project concurrent-hashmap
 * -----
 * Khởi 3 trường hợp liên quan của Map
 *      + hashTable
 *      + synchronizedMap
 *      + concurrentHashMap
 */
public class ConcurrentHashMapVsSynchronizedMap {
    public final static int THREAD_POOL_SIZE = 10;
    public final static int DATA_SIZE        = 1_000_000;

    public static Map<String, Integer> hashTable = null;
    public static Map<String, Integer> synchronizedMap = null;
    public static Map<String, Integer> concurrentHashMap = null;

    public static void main(String[] args) {
        System.out.println("---> Start of test");

        hashTable = new Hashtable<>();
        performTest(hashTable);

        synchronizedMap = Collections.synchronizedMap(new HashMap<>());
        performTest(synchronizedMap);

        concurrentHashMap = new ConcurrentHashMap<>();
        performTest(concurrentHashMap);

        System.out.println("---> End of test");
    }

    private static void performTest(Map<String, Integer> testMap) {
        System.out.println("Test started for: " + testMap.getClass());
        long averageTime = 0;

        for(int i = 0; i < 10; i++){
            long startTime = System.nanoTime();

            ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

            for(int j = 0; j < THREAD_POOL_SIZE; j++){
                executorService.execute(new Runnable() {
                    @SuppressWarnings("unused")
                    @Override
                    public void run() {
                        for (int k = 0; k < DATA_SIZE; k++){
                            Integer randomNumber = (int)Math.ceil(Math.random() + 100000);
                            Integer value = testMap.get(String.valueOf(randomNumber));
                            testMap.put(String.valueOf(randomNumber), randomNumber);
                        }
                    }
                });
            }

            executorService.shutdown();
            try {
                executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long endTime = System.nanoTime();
            long totalTime = (endTime - startTime) / 1000000L;
            averageTime += totalTime;

            System.out.println("1M entries added/retrieved in " + totalTime + " ms");


        }

        System.out.println("For " + testMap.getClass() + " the average time is " + averageTime / 10 + " ms\n");
    }

}
