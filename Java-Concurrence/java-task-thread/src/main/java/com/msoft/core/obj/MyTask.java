package com.msoft.core.obj;

import com.msoft.core.scheduler.AbsTask;
import java.util.Date;

/**
 * @author ManhKM on 8/28/2022
 * @project java-task-thread
 */
public class MyTask extends AbsTask {

    String taskName;

    public MyTask(String taskName){
        this.taskName = taskName;
    }

    @Override
    public void run() {
        try {
            execute();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void execute() {
        System.out.println("Running My Task" + this.taskName);
    }

    /**
     * Lấy ra ngày bắt đầu gia hạn
     * @return
     */
    @Override
    public Date getStartDate() {
        return null;
    }

    /**
     * Sau khi hết hạn
     */
    @Override
    public void afterExpire() {

    }
}
