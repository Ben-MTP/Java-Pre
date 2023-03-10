package com.jindo.core.session4.customthreadpool;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 3/10/2023
 * @project multi-thread-tutorial
 */
public class ThreadPoolExecutorExample {

    public static void main(String[] args) throws InterruptedException {

        final int CORE_POOL_SIZE = 2;
        final int MAX_POOL_SIZE = 4;
        final long KEEP_ALIVE_TIME = 10;

        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(2);

        RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();

        ThreadFactory threadFactory = new ThreadFactoryBuilder()
                .setNamePrefix("ManhKM-ThreadPool")
                .setDaemon(false)
                .setPriority(Thread.MAX_PRIORITY)
                .setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        System.err.println(String.format("Custom Exception: Thread %s threw exception - %s",
                                t.getName(), e.getMessage()));
                    }
                }).build();

        // Creating the ThreadPoolExecutor:
        ThreadPoolExecutor executorPool = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS, workQueue, threadFactory, rejectionHandler);

        // start the monitoring thread
        MonitorThread monitor = new MonitorThread(executorPool, 3);
        Thread monitorThread = new Thread(monitor);
        monitorThread.start();

        // submit work to the thread pool
        for (int i = 1; i <= 10; i++) {
            executorPool.execute(new WorkerTempThread("cmd" + i));
        }

        Thread.sleep(30000);

        // shut down the pool
        executorPool.shutdown();

        // shut down the monitor thread
        Thread.sleep(5000);
        monitor.shutdown();

    }
}
