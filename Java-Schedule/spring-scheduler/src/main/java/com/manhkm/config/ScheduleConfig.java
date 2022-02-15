package com.manhkm.config;

import com.manhkm.schedule.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author ManhKM on 2/15/2022
 * @project spring-scheduler
 */

@Configuration
@EnableScheduling
public class ScheduleConfig {

    @Scheduled(cron = "0 * * * * *")
    public void showTime() {
        ShowTime.main(null);
    }
}
