package com.msoft.core;

import com.msoft.core.config.ExecutorServiceConfig;
import com.msoft.core.entity.Customer;
import com.msoft.core.task.CustomerProcessor;
import java.util.concurrent.ConcurrentLinkedDeque;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        String directionFile = "data";
        ApplicationContext context = new AnnotationConfigApplicationContext(
                ExecutorServiceConfig.class);
        CustomerProcessor customerProcessor = context.getBean(CustomerProcessor.class);

        System.out.println("SERVER_IS_READY");

        customerProcessor.process(directionFile);
    }

}
