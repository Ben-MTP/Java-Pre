package com.jindo.core.model;

/**
 * @author ManhKM on 9/5/2022
 * @project spring-boot-log4j2
 * -----
 * Minh họa End user tương tác với một cái Page -> và module logging lại việc đó
 */
public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            '}';
    }
}
