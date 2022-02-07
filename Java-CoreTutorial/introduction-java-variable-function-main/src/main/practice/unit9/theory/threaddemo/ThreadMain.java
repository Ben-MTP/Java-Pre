package main.practice.unit9.theory.threaddemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author ManhKM on 2/6/2022
 * @project introduction-java-variable-function-main
 */
public class ThreadMain {
    static long N = 1000000000;

    public static void sumTest(){
        long sum = 0;
        long start = System.currentTimeMillis();
        for(int i = 0; i < N; i++){
            sum += i;
        }
        System.out.println("Total Time Execute of 1 Thread: " + (System.currentTimeMillis() - start));

    }

    public static void main(String[] args) throws InterruptedException {

        // Khởi tạo với 2 thread
        // Thực thi với ThreadPool
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        long start = System.currentTimeMillis();
        Future<Long> sumFuture1 = executorService.submit(() -> {
            long sum = 0;
            for(int i = 0; i < N; i++){
                sum += i;
            }
            return sum;
        });

        Future<Long> sumFuture2 = executorService.submit(() -> {
           long sum = 0;
           for(int i = 0; i < N; i++){
               sum += i;
           }
           return sum;
        });

        while (!sumFuture1.isDone() || !sumFuture2.isDone()){
            Thread.sleep(1);
        }

        long totalExecuteTime = System.currentTimeMillis() - start;
        System.out.println("Total Time Execute of 2 Thread: " + totalExecuteTime);

        sumTest();

        executorService.shutdown();
    }
}
