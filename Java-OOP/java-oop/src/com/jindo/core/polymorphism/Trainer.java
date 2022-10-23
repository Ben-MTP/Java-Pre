package com.jindo.core.polymorphism;

/**
 * @author ManhKM on 10/23/2022
 * @project java-oop
 * -----
 * Định nghĩa một Class Trainer -> người huấn luyện
 */
public class Trainer {

    public void teach(Animal animal){
        animal.move();
    }
}
