package com.logging.core;

import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author ManhKM on 2/14/2022
 * @project java-logging
 */
public abstract class ThreadManager {
    public final int BATCH_SIZE = 10;//Chương trình sẽ thực hiện doProcess khi hàng đợi vượt quá 10 phần tử
    public final long WAIT_TIME_OUT = 1000; //ms
    public final long TIME_OUT = 2 * 1000; //ms. Chương trình sẽ thực hiện doProcess với chu kỳ 2 giây
    private final Logger logger = org.apache.logging.log4j.LogManager.getLogger(ThreadManager.class);
    private final BlockingQueue sourceQueue = new LinkedBlockingQueue();
    protected ArrayList items = new ArrayList(BATCH_SIZE);
    protected AtomicBoolean shouldWork = new AtomicBoolean(true);
    protected AtomicBoolean isRunning = new AtomicBoolean(true);
    private boolean listening = false;
    private String name = "ACTION/API LOGGER";
    protected ExecutorService executorService = Executors.newFixedThreadPool(5);
    private Thread mainThread;

    public ThreadManager() {
        logger.debug("Start task manager named: " + name);
        mainThread = new Thread(new Runnable() {
            @Override
            public void run() {
                logger.info("Queued job manager " + name + " is running and watching for queue... ");
                isRunning.set(true);
                int recNum = 0;
                long lgnStart = System.currentTimeMillis();
                while (shouldWork.get()) {
                    try {
                        Object item = sourceQueue.poll(WAIT_TIME_OUT, TimeUnit.MILLISECONDS);
                        if (item != null) {
                            items.add(item);
                            recNum++;
                        }

                        if (recNum >= BATCH_SIZE || timedOut(lgnStart)) {
                            if (items.size() > 0) {
                                logger.info(String.format("Thread %s: %s submits %d item(s)",
                                        Thread.currentThread().getName(), name, items.size()));
                                doProcess(items);
                                items = new ArrayList(BATCH_SIZE);
                                lgnStart = System.currentTimeMillis();
                                recNum = 0;
                            }
                        }
                    } catch (Exception e) {
                        logger.error(e.getMessage());
                    }
                    isRunning.set(false);
                }
                logger.info("Taskmanager " + name + " is stopped!!");
            }

            private boolean timedOut(Long startTime) {
                return System.currentTimeMillis() - startTime > TIME_OUT;
            }
        });

    }

    /**
     * abstract method xử lý nghiệp vụ
     * @param items
     */
    public abstract void doProcess(ArrayList items);

    /**
     * Bắt đầu lắng nghe dữ liệu cần xử lý từ hàng đợi
     * Từ khóa synchronized
     *      Dùng trong việc tránh xử lý chiếm đóng tài nguyên của Thread.
     */
    public synchronized void listen() {
        if (!listening) {
            mainThread.start();
            listening = true;
        }
    }

    public BlockingQueue getSourceQueue() {
        return sourceQueue;
    }

    public void stop() {
        logger.info(String.format("%s received a termination signal, stopping ... ", name));
        this.shouldWork.set(false);
        int tryTime = 0;
        while (isRunning.get() && tryTime < 50) {
            try {
                Thread.currentThread().sleep(50L);
            } catch (Exception ex) {

            }
            tryTime++;
        }
    }

    /**
     * Submit một đối tượng cần xử lý vào hàng đợi
     * @param item
     */
    public void submit(Object item) {
        sourceQueue.offer(item);
    }
}
