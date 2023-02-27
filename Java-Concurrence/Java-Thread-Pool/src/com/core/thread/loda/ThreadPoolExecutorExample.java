package com.core.thread.loda;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 4/23/2022
 * @project Java-Thread-Pool
 */
public class ThreadPoolExecutorExample {

  public static void main(String[] args) {
    int corePoolSize = 5;
    int maximumPoolSize = 10;
    int queueCapacity = 100;

    ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize,
        maximumPoolSize,
        10,     //Thời gian một thread được sống nếu không làm gì
        TimeUnit.SECONDS,
        new ArrayBlockingQueue<>(queueCapacity));   // Blocking queue để cho request đợi

    // 1000 request đến dồn dập, liền 1 phát, không nghỉ.
    for (int i = 0; i < 1000; i++) {
      executor.execute(new RequestHandler("request-" + i));
      try {
        Thread.sleep(50);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    executor.shutdown();    // Không cho threadpool nhận thêm nhiệm vụ vào nữa

    while (!executor.isTerminated()) {
      //
    }
  }
}
