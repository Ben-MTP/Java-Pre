package com.task;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 8/10/2022
 * @project java-task
 */
public abstract class AbsTask implements Task{

    private Date d;

    public AbsTask(){
        this.d = null;
    }

    @Override
    public long getDelay() {
        if(this.d == null){
            this.d = this.getStartDate();
        }
        if(this.d != null){
            return this.getStartDate().getTime() - System.currentTimeMillis();
        }
        return 0L;
    }

    @Override
    public TimeUnit getTimeUnit() {
        return TimeUnit.MILLISECONDS;
    }
}
