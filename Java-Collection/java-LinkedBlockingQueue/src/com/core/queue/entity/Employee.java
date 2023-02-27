package com.core.queue.entity;

/**
 * @author ManhKM on 11/25/2022
 * @project java-LinkedBlockingQueue
 */
public class Employee {

    private int id;
    private String name;
    private String address;
    private int age;

    public Employee() {
    }

    public Employee(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", age=" + age +
            '}';
    }
}
