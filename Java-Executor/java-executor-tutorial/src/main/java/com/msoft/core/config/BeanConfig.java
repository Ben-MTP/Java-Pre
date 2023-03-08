package com.msoft.core.config;

import com.msoft.core.entity.Customer;
import java.util.concurrent.ConcurrentLinkedDeque;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ManhKM on 3/8/2023
 * @project java-executor-tutorial
 */
@Configuration
public class BeanConfig {

    @Bean(name = "customers")
    public ConcurrentLinkedDeque<Customer> customers(){
        return new ConcurrentLinkedDeque<>();
    }
}
