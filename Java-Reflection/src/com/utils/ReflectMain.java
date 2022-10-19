package com.utils;

import com.reflect.Person;
import java.util.Date;

/**
 * @author ManhKM on 10/19/2022
 * @project Java-Reflection
 */
public class ReflectMain {

    public static void main(String[] args) {
        Person person = new Person();
        // Cách thông thường:
        person.setName("ManhKM");
        person.setBirthday(new Date());
        System.out.println("Case01: " + person.toString());

        // Dùng Reflection:
        ReflectUtils.set(person, "name", "ManHKM Reflection");
        ReflectUtils.set(person, "birthday", new Date());
        ReflectUtils.set(person, "address", "Thái Bình");
        System.out.println("Case02: " + person.toString());

    }
}
