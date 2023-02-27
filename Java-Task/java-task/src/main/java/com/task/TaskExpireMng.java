package com.task;

import org.slf4j.*;
import java.util.concurrent.*;
import java.util.*;

/**
 * @author ManhKM on 8/10/2022
 * @project java-task
 */
public class TaskExpireMng {

    private final Logger logger;
    private List<TaskInfo> listTask;
    private Object lock;
    private long delay;
    private Thread thread;
    private long expireTime;
    private ScheduledThreadPoolExecutor scheduledThreadPool;

    public TaskExpireMng(final long timeKeepAlive, final TimeUnit unit, final ScheduledThreadPoolExecutor scheduledThreadPool) {
        this.logger = LoggerFactory.getLogger((Class)this.getClass());
        this.listTask = null;
        this.lock = new Object();
        this.delay = 1000L;
        this.logger.debug("Init check task expire");
        this.listTask = new ArrayList<TaskInfo>();
        final TimeUnit time = TimeUnit.MILLISECONDS;
        this.expireTime = time.convert(timeKeepAlive, unit);
        this.scheduledThreadPool = scheduledThreadPool;
        this.init();
    }

    private void init() {
        (this.thread = new Thread(new MonitoringTask())).start();
    }

    public void addTaskMonitor(final ScheduledFuture<?> t, final Task task) {
        this.addTaskMonitor(new TaskInfo(this.expireTime + System.currentTimeMillis(), t, task));
    }

    public void addTaskMonitor(final TaskInfo taskInfo) {
        this.listTask.add(taskInfo);
    }

    private void removeTaskExpire(final List<TaskInfo> listId) {
        synchronized (this.lock) {
            for (final TaskInfo task : listId) {
                this.listTask.remove(task);
            }
        }
    }

    private class MonitoringTask implements Runnable
    {
        @Override
        public void run() {
            while (!TaskExpireMng.this.scheduledThreadPool.isTerminated()) {
                final long currentTime = System.currentTimeMillis();
                final List<TaskInfo> listTaskRemove = new ArrayList<TaskInfo>();
                for (int i = 0; i < TaskExpireMng.this.listTask.size(); ++i) {
                    final TaskInfo taskInfo = TaskExpireMng.this.listTask.get(i);
                    if (taskInfo.getExpireTime() < currentTime) {
                        listTaskRemove.add(taskInfo);
                        if (!taskInfo.getT().isDone()) {
                            taskInfo.getT().cancel(false);
                            taskInfo.getTask().afterExpire();
                        }
                    }
                }
                TaskExpireMng.this.removeTaskExpire(listTaskRemove);
                try {
                    Thread.sleep(TaskExpireMng.this.delay);
                }
                catch (InterruptedException ex) {}
            }
        }
    }

}
