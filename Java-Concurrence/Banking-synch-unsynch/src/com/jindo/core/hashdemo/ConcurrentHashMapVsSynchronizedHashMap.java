package com.jindo.core.hashdemo;

/**
 * @author ManhKM on 5/10/2022
 * @project Banking-synch-unsynch
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ConcurrentHashMapVsSynchronizedMap {

    public final static int THREAD_POOL_SIZE = 10;

    public static Map<String, Integer> hashTable = null;
    public static Map<String, Integer> synchronizedMap = null;
    public static Map<String, Integer> concurrentHashMap = null;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Đây là kết quả trung bình (10 lần) sau khi đọc ghi 1 triệu entries đối với từng loại Map: ");
        // Test with Hashtable Object
        hashTable = new Hashtable<String, Integer>();
        performTest(hashTable);

        // Test with synchronizedMap Object
        synchronizedMap = Collections.synchronizedMap(new HashMap<String, Integer>());
        performTest(synchronizedMap);

        // Test with ConcurrentHashMap Object
        concurrentHashMap = new ConcurrentHashMap<String, Integer>();
        performTest(concurrentHashMap);

    }

    /**
     * ExecutorService
     *      + newFixedThreadPool
     *      + execute()...
     *      + shutdown()...
     *      + awaitTermination()...
     */
    //final
    public static void performTest(Map<String, Integer> testMap) throws InterruptedException {

        System.out.println("Test started for: " + testMap.getClass());
        long averageTime = 0;
        for (int i = 0; i < 10; i++) {

            long startTime = System.nanoTime();
            ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

            for (int j = 0; j < THREAD_POOL_SIZE; j++) {
                executorService.execute(new Runnable() {
                    @SuppressWarnings("unused")
                    @Override
                    public void run() {

                        for (int i = 0; i < 1000000; i++) {
                            Integer randomNumber = (int) Math.ceil(Math.random() * 100000);

                            // Retrieve value. Only for test
                            Integer value = testMap.get(String.valueOf(randomNumber));

                            // Put value
                            testMap.put(String.valueOf(randomNumber), randomNumber);
                        }
                    }
                });
            }

            executorService.shutdown();
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);

            long endTime = System.nanoTime();
            long totalTime = (endTime - startTime) / 1000000L;
            averageTime += totalTime;
            System.out.println("1M entried added/retrieved in " + totalTime + " ms");
        }
        System.out.println("For " + testMap.getClass() + " the average time is " + averageTime / 10 + " ms\n");
    }
}
