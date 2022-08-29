package com.msoft.javajob.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ManhKM on 8/28/2022
 * @project Java-Task
 */
@RestController
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello(){
        return "Welcome to Java-Job";
    }
}
