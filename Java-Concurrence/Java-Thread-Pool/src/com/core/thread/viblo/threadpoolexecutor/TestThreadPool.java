package com.core.thread.viblo.threadpoolexecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 8/11/2022
 * @project Java-Thread-Pool
 * -----
 * Tham khảo: ThreadPool trong Java
 */
public class TestThreadPool {

    public static void main(String[] args) {
        int corePoolSize = 50;       // Số lượng Thread tối thiếu trong ThreadPool
        int maximumPoolSize = 100;
        long keepAliveTime = 500;

        TimeUnit timeUnit = TimeUnit.SECONDS;

        ArrayBlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(100);

        RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, timeUnit, workQueue, handler);

        for (int i = 0; i < 1000; i++){
            threadPoolExecutor.execute(new Task(i));
        }
    }
}
