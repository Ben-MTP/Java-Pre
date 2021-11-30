package com.manhkm.javajdbc.entity;

/**
 * @author ManhKM on 11/30/2021
 * @project Java-JDBC
 */
public class Student {
    private String id;
    private String name;
    private String code;
    private String date_of_birth;
    private String email;
    private String class_id;

    public Student(String id, String name, String code, String date_of_birth, String email, String class_id) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.date_of_birth = date_of_birth;
        this.email = email;
        this.class_id = class_id;
    }

    public Student(String name, String code, String date_of_birth, String email, String class_id) {
        this.name = name;
        this.code = code;
        this.date_of_birth = date_of_birth;
        this.email = email;
        this.class_id = class_id;
    }

    public Student(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", email='" + email + '\'' +
                ", class_id='" + class_id + '\'' +
                '}';
    }
}
