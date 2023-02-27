package com.msoft.core.scheduler;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ManhKM on 8/28/2022
 * @project java-task-thread
 */
public class TaskScheduleExecute implements Closeable {

    private final Logger logger;
    private static final long TIME_KEEP_ALIVE_DEFAULT = 8L;
    private static final TimeUnit TIME_UNIT_DEFAULT;
    private ScheduledThreadPoolExecutor scheduledThreadPool;

    static {
        TIME_UNIT_DEFAULT = TimeUnit.HOURS;
    }

    public TaskScheduleExecute(int corePoolSize, int maximumPoolSize, boolean continueTaskAfterShutdown, long timeKeepAlive, TimeUnit unit, boolean removeOnCancelPolicy){
        this.logger = LoggerFactory.getLogger(this.getClass());
        this.scheduledThreadPool = new ScheduledThreadPoolExecutor(corePoolSize);
        this.scheduledThreadPool.setMaximumPoolSize(maximumPoolSize);
        this.scheduledThreadPool.setContinueExistingPeriodicTasksAfterShutdownPolicy(continueTaskAfterShutdown);
        this.scheduledThreadPool.setKeepAliveTime(timeKeepAlive, unit);
        this.scheduledThreadPool.setRemoveOnCancelPolicy(removeOnCancelPolicy);
        this.scheduledThreadPool.setThreadFactory(new ThreadFactory() {
            public Thread newThread(Runnable r) {
                return new Thread(r, "TaskSchedule-");
            }
        });
        this.taskExpire = new TaskExpireMng(timeKeepAlive, unit, this.scheduledThreadPool);
    }

    @Override
    public void close() throws IOException {

    }
}
