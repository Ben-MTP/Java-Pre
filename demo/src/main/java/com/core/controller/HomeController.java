package com.core.controller;

import com.core.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: demo (>_<)/
 * Author: ManhKM as [ADMIN]
 * Date-Time: 7/18/2023-11:18 AM
 * Note:
 */
@RestController
@RequestMapping("home")
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Value("${app.data.message}")
    private String message;

    public static List<Person> list = new ArrayList<>();

    static {
        for (int i = 0; i < 999; i++) {
            list.add(new Person(Long.valueOf(i), "name_" + i, "address_" + i, i + 18));
        }
    }

    @GetMapping()
    public List<Person> getList() {
        logger.info(">>>>> starting method getList()/HomeController.....");
        List<Person> data = new ArrayList<>();
        for (Person person : list) {
            Person _temp = new Person(person.getId(), person.getName(), person.getAddress(), person.getAge(), message);
            data.add(_temp);
        }
        logger.info("Size of Person: " + data.size());

        logger.info(">>>>> end method getList()/HomeController.....");

        return data;
    }
}
