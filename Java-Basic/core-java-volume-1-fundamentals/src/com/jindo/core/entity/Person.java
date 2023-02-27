package com.jindo.core.entity;

/**
 * @author ManhKM on 5/20/2022
 * @project core-java-volume-1-fundamentals
 */
public abstract class Person extends Object{

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getDescription();
}
