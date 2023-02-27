package com.msoft.core.scheduler;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 8/28/2022
 * @project java-task-thread
 */
public abstract class AbsTask implements Task{

    private Date d = null;

    public AbsTask(){

    }

    @Override
    public long getDelay() {
        if(this.d == null){
            this.d = this.getStartDate();
        }

        return this.d != null ? this.getStartDate().getTime() - System.currentTimeMillis() : 0L;
    }

    @Override
    public TimeUnit getTimeUnit(){
        return TimeUnit.MILLISECONDS;
    }
}
