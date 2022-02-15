package com.manhkm.schedule.config;

import com.manhkm.schedule.springsche.ShowTime;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author ManhKM on 2/15/2022
 * @project spring-sche
 */
@Configuration
@EnableScheduling
public class ScheduleConfig {

    @Scheduled(cron = "0 * * * * *")//Chạy vào 0s của mỗi phút
    public void showTime(){
        ShowTime.main(null);
    }
}
