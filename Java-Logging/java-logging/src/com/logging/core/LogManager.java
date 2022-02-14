package com.logging.core;

import java.util.ArrayList;

/**
 * @author ManhKM on 2/14/2022
 * @project java-logging
 */
public class LogManager extends ThreadManager{
    @Override
    public void doProcess(ArrayList items) {
        LogThread logThread = new LogThread();
        logThread.setItems(items);
        executorService.submit(logThread);
    }
}
