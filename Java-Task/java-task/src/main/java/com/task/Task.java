package com.task;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 8/10/2022
 * @project java-task
 */
public interface Task extends Runnable{
    long getDelay();

    TimeUnit getTimeUnit();

    Date getStartDate();

    void afterExpire();
}
