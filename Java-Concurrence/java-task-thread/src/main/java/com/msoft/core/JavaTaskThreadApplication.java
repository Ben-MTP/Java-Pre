package com.msoft.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ImportResource({ "file:config/beans.xml", "file:config/schedule-conf.xml" })
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
public class JavaTaskThreadApplication {

  public static void main(String[] args) {
    SpringApplication.run(JavaTaskThreadApplication.class, args);
  }

}
