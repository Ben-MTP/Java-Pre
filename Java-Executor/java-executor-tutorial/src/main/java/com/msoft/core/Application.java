package com.msoft.core;

import com.msoft.core.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        String directionFile = "data";

        ApplicationContext context = SpringApplication.run(Application.class, args);

        CustomerService customerService = context.getBean(CustomerService.class);

        System.out.println("SERVER_IS_READY");

        customerService.loadCustomersFromFiles(directionFile);
    }

}
