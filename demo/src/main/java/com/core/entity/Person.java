package com.core.entity;

/**
 * Project: demo (>_<)/
 * Author: ManhKM as [ADMIN]
 * Date-Time: 7/18/2023-11:19 AM
 * Note:
 */
public class Person {
    private Long id;
    private String name;
    private String address;
    private Integer age;
    private String description;

    public Person() {
    }

    public Person(Long id, String name, String address, Integer age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Person(Long id, String name, String address, Integer age, String description) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                '}';
    }
}
