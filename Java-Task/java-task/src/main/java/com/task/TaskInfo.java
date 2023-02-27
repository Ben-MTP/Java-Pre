package com.task;

import java.util.concurrent.ScheduledFuture;

/**
 * @author ManhKM on 8/10/2022
 * @project java-task
 */
public class TaskInfo {

    private long expireTime;
    private ScheduledFuture<?> t;
    private Task task;

    public TaskInfo(long expireTime, ScheduledFuture<?> t, Task task) {
        this.expireTime = expireTime;
        this.t = t;
        this.task = task;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }

    public ScheduledFuture<?> getT() {
        return t;
    }

    public void setT(ScheduledFuture<?> t) {
        this.t = t;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
