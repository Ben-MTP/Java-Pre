package com.jindo.core.polymorphism;

/**
 * @author ManhKM on 10/23/2022
 * @project java-oop
 */
public class Bird implements Animal{

    @Override
    public void move() {
        System.out.println("Flying...");
    }
}
