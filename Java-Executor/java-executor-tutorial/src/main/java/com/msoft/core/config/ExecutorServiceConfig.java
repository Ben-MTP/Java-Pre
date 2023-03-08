package com.msoft.core.config;

import com.msoft.core.task.CustomerProcessor;
import java.util.concurrent.Executor;
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

    @Bean
    public Executor executor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("CustomerReader-");
        executor.initialize();
        return executor;
    }

    /**
     * Tạo mới một Bean CustomerProcessor để thực hiện logic riêng Khởi tạo Thread thông qua
     * Constructor của Processor
     *
     * @param executor
     * @return
     */
    @Bean
    public CustomerProcessor customerProcessor(Executor executor) {
        return new CustomerProcessor(executor);
    }
}
