package com.msoft.core.scheduler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 8/28/2022
 * @project java-task-thread
 */
@Component
public class ExecutionListTask {
    private final Logger logger = LogManager.getLogger(ExecutionListTask.class);

    @Autowired
    private TaskScheduleExecute taskSchedule;
}
