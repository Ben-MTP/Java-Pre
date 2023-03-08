package com.msoft.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author ManhKM on 3/8/2023
 * @project java-executor-tutorial
 * <p>
 * Trong đó, ta sử dụng @Configuration và @EnableAsync để đánh dấu rằng đây là một class cấu hình và
 * sử dụng các tính năng của Spring Async để tạo ExecutorService
 */
@Configuration
@EnableAsync
public class ExecutorServiceConfig {

    @Value("${app.executor.core-pool-size}")
    private String corePoolSize;

    @Value("${app.executor.max-pool-size}")
    private String maxPoolSize;

    @Value("${app.executor.queue-capacity}")
    private String queueCapacity;

    @Value("${app.executor.name-prefix}")
    private String namePrefix;

    @Bean
    public ThreadPoolTaskExecutor executor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(Integer.parseInt(corePoolSize));
        executor.setMaxPoolSize(Integer.parseInt(maxPoolSize));
        executor.setQueueCapacity(Integer.parseInt(queueCapacity));
        executor.setThreadNamePrefix(namePrefix);
        executor.initialize();
        return executor;
    }
}
