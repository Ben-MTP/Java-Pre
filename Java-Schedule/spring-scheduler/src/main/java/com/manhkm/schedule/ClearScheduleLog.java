package com.manhkm.schedule;

/**
 * @author ManhKM on 2/15/2022
 * @project spring-scheduler
 */
public class ClearScheduleLog extends ScheduleManager {
    private int numOfExpiredDays;

    public ClearScheduleLog() {
        super("CLEAR_SCHEDULE_LOG");
    }

    @Override
    protected void initParameters() {
        this.numOfExpiredDays = getParamAsInteger("numOfExpiredDays", 180);

    }

    @Override
    protected boolean validateParameters() throws Exception {
        return true;
    }

    @Override
    public void run() {
        int result = 0;
        //Xử lý xóa log theo tham số quá hạn numOfExpiredDays
        logInfo("Deleted " + result + " record(s)");
    }
}
