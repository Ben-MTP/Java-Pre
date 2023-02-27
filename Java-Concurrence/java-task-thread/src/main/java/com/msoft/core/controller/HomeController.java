package com.msoft.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ManhKM on 8/28/2022
 * @project java-task-thread
 */
@RestController
public class HomeController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String sayHello(){
    return "Welcome to Java-Task-Thread";
  }
}
