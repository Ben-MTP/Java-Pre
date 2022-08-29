package com.msoft.javajob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
public class JavaJobApplication {

  private static final Logger logger = LoggerFactory.getLogger(JavaJobApplication.class);

  public static void main(String[] args) {
    try {
      SpringApplication.run(JavaJobApplication.class, args);

      System.out.println("SERVER_IS_READY");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
