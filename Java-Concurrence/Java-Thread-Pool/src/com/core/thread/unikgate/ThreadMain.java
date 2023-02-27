package com.core.thread.unikgate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author ManhKM on 1/3/2023
 * @project Java-Thread-Pool ---- Test tốc độ chạy của ThreadPool so với Thread thông thường
 */
public class ThreadMain {

  static long N = 1_000_000_000_000_000L;

  public static void main(String[] args) throws InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(50);
    long start = System.currentTimeMillis();

    System.out.println("SERVER IS READY!");
    Future<Long> sumFuture1 = executorService.submit(() -> {
      long sum = 0;
      for (int i = 0; i < N; i++) {
        sum += i;
      }
      return sum;
    });

    Future<Long> sumFuture2 = executorService.submit(() -> {
      long sum = 0;
      for (int i = 0; i < N; i++) {
        sum += i;
      }
      return sum;
    });

    int countWaiting = 0;
    while (!sumFuture1.isDone() || !sumFuture2.isDone()) {
      Thread.sleep(1);
      countWaiting++;
      System.out.println("     [" + countWaiting + "]waiting...");
    }

    System.out.println("Total time execute: " + (System.currentTimeMillis() - start) + " milis");

    executorService.shutdown();
  }
}
