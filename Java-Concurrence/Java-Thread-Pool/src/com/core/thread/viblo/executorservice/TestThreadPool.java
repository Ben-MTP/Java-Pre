package com.core.thread.viblo.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 8/11/2022
 * @project Java-Thread-Pool
 */
public class TestThreadPool {

  public static void main(String[] args) {
    ExecutorService pool = Executors.newFixedThreadPool(5);

//    for (int i = 0; i < 100; i++){
////      pool.submit(new Task(i));
//      pool.execute(new Task(i));
//
//    }
//
//    try {
//      pool.awaitTermination(1, TimeUnit.DAYS);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
    for (int i = 0; i < 10; i++){
      int finalI = i;
      pool.execute(new Runnable() {
        @Override
        public void run() {
          System.out.println("Asynchronous task starting!!! " + finalI);
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println("     Asynchronous task DONE... " + finalI);

        }
      });
    }

    pool.shutdown();
  }
}
