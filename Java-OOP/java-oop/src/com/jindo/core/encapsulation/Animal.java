package com.jindo.core.encapsulation;

import com.jindo.core.inte.IAct;

/**
 * @author ManhKM on 5/16/2022
 * @project java-oop
 * ---- Khởi tạo đối tượng Animal đại diện cho các loại vật có trong Zoo
 * 1. Tính chất đóng gói thể hiện ở việc đưa các thuộc tính, hành vi của đối tượng vào trong một class.
 * 2. Việc che dấu đi các thuộc tính bên trong và chỉ cho theo tác ra ngoài thông qua các method public
 */
public class Animal implements IAct {
    private String name;
    private String weight;
    private String height;

    public Animal(String name, String weight, String height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    @Override
    public void running(String style) {
        System.out.println("Chạy theo một kiểu Animal");
    }
}
