package com.jindo.core.inheritance;

import com.jindo.core.encapsulation.Animal;
import com.jindo.core.inte.IRun;

/**
 * @author ManhKM on 5/16/2022
 * @project java-oop
 */
public class Dog extends Animal implements IRun {

    public Dog(String name, String weight, String height) {
        super(name, weight, height);
    }

    @Override
    public void running(String style) {
        System.out.println("Chạy theo kiểu con Chó: vừa đi vừa: " + style);
    }
}
