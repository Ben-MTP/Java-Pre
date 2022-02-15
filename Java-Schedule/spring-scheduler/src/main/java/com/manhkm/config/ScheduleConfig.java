package com.manhkm.config;

import com.manhkm.schedule.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author ManhKM on 2/15/2022
 * @project spring-scheduler
 */

@Configuration
@EnableScheduling
@ConditionalOnProperty(value = "schedule.enabled", matchIfMissing = true, havingValue = "true")
public class ScheduleConfig {

    @Scheduled(cron = "${schedule.clear.schedule.log}")
    public void clearScheduleLog() {
        new ClearScheduleLog();
    }
}
