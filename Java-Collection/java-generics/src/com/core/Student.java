package com.core;

/**
 * @author ManhKM on 8/23/2022
 * @project java-generics
 */
public class Student {
    private String name;
    private String address;
    private int age;

    public Student() {
    }

    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
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
        return "Student{" +
            "name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", age=" + age +
            '}';
    }
}
