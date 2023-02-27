package com.msoft.core.scheduler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ManhKM on 8/28/2022
 * @project java-task-thread
 * -----
 * Quản lý các Task hết hạn.
 */
public class TaskExpireMng {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private List<TaskInfo> listTask = null;
    private Object lock = new Object();
    private long delay = 1000L;
    private Thread thread;
    private long expireTime;
    private ScheduledThreadPoolExecutor scheduledThreadPool;

    public TaskExpireMng(long timeKeepAlive, TimeUnit unit, ScheduledThreadPoolExecutor scheduledThreadPool) {
        this.logger.debug("Init check task expire");
        this.listTask = new ArrayList();
        TimeUnit time = TimeUnit.MILLISECONDS;
        this.expireTime = time.convert(timeKeepAlive, unit);
        this.scheduledThreadPool = scheduledThreadPool;
        this.init();
    }

    private void init() {
        this.thread = new Thread(new TaskExpireMng.MonitoringTask());
        this.thread.start();
    }

    public void addTaskMonitor(ScheduledFuture<?> t, Task task) {
        addTaskMonitor(new TaskInfo(this.expireTime + System.currentTimeMillis(), t, task));
    }

    public void addTaskMonitor(TaskInfo taskInfo) {
        this.listTask.add(taskInfo);
    }

    private void removeTaskExpire(List<TaskInfo> listId) {
        synchronized(this.lock) {
            Iterator var3 = listId.iterator();

            while(var3.hasNext()) {
                TaskInfo task = (TaskInfo)var3.next();
                this.listTask.remove(task);
            }

        }
    }

    private class MonitoringTask implements Runnable {
        private MonitoringTask() {
        }

        public void run() {
            while(!TaskExpireMng.this.scheduledThreadPool.isTerminated()) {
                long currentTime = System.currentTimeMillis();
                List<TaskInfo> listTaskRemove = new ArrayList();

                for(int i = 0; i < TaskExpireMng.this.listTask.size(); ++i) {
                    TaskInfo taskInfo = (TaskInfo)TaskExpireMng.this.listTask.get(i);
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
                } catch (InterruptedException var6) {
                }
            }

        }
    }
}
