package com.msoft.core.scheduler;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 8/28/2022
 * @project java-task-thread
 */
public interface Task extends Runnable{

    long getDelay();

    TimeUnit getTimeUnit();

    Date getStartDate();

    void afterExpire();
}
