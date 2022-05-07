package com.core.serializable.entity;

import java.io.Serializable;

/**
 * Object Customer -> chỉ là một class thông thường.
 * Nếu để chúng có thể thực hiện chuyển đổi qua lại thì phải sử dụng -> implement Serializable
 *
 * + transient: -> nó sẽ không được serialization
 * @author ManhKM on 4/13/2022
 * @project Java-Serializable
 */
public class Customer implements Serializable {

    /**
     * serialVersionUID -> để đảm bảo răng đối tượng trước/sau khi serialization là duy nhất
     */
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private int age;
    private String address;

    public Customer() {
    }

    public Customer(Long id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
