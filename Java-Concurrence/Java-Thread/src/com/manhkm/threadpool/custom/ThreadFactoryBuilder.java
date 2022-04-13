package com.manhkm.threadpool.custom;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author ManhKM on 4/9/2022
 * @project Java-Thread
 */
public class ThreadFactoryBuilder {
    private String namePrefix = null;
    private boolean daemon = false;
    private int priority = Thread.NORM_PRIORITY;
    private ThreadFactory backingThreadFactory = null;
    private Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;

    public ThreadFactoryBuilder(){

    }

    public ThreadFactoryBuilder setNamePrefix(String namePrefix){
        if(namePrefix == null){
            throw new NullPointerException();
        }
        this.namePrefix = namePrefix;
        return this;
    }

    public ThreadFactoryBuilder setDaemon(boolean daemon){
        this.daemon = daemon;
        return this;
    }

    public ThreadFactoryBuilder setPriority(int priority){
        if(priority < Thread.MIN_PRIORITY){
            throw new IllegalArgumentException( String.format("Thread priority (%s) must be >= %s", priority, Thread.MIN_PRIORITY));
        }
        this.backingThreadFactory = backingThreadFactory;
        return this;

    }

    public ThreadFactory build(){
        return build(this);
    }

    private static ThreadFactory build(ThreadFactoryBuilder builder){
        final String namePrefix = builder.namePrefix;
        final Boolean daemon    = builder.daemon;
        final Integer priority  = builder.priority;
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = builder.uncaughtExceptionHandler;
        final ThreadFactory backingThreadFactory = (builder.backingThreadFactory != null) ? builder.backingThreadFactory
                : Executors.defaultThreadFactory();
        final AtomicLong count = new AtomicLong(0);
        return new ThreadFactory() {
            @Override
            public Thread newThread(Runnable runnable) {
                Thread thread = backingThreadFactory.newThread(runnable);
                if (namePrefix != null) {
                    thread.setName(namePrefix + "-" + count.getAndIncrement());
                }
                if (daemon != null) {
                    thread.setDaemon(daemon);
                }
                if (priority != null) {
                    thread.setPriority(priority);
                }
                if (uncaughtExceptionHandler != null) {
                    thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                }
                return thread;
            }
        };

    }
}
