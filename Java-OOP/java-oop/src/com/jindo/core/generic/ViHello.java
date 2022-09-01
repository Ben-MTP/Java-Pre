package com.jindo.core.generic;

/**
 * @author ManhKM on 9/1/2022
 * @project java-oop
 */
public class ViHello implements Hello{

    @Override
    public void show(String name, int age) {
        System.out.println("Xin chào Việt Nam");
    }
}
