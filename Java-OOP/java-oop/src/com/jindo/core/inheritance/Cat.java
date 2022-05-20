package com.jindo.core.inheritance;

import com.jindo.core.encapsulation.Animal;
import com.jindo.core.inte.IClimb;
import com.jindo.core.inte.IRun;

/**
 * @author ManhKM on 5/16/2022
 * @project java-oop
 * -----
 * Kế thừa lại các tính chất của lớp cha:
 *             các hành vi của lớp cha
 */
public class Cat extends Animal implements IRun, IClimb {
    private String featherColor;

    public Cat(String name, String weight, String height, String featherColor) {
        super(name, weight, height);
        this.featherColor = featherColor;
    }

    public Cat(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void running(String style) {
        System.out.println("Chạy theo kiểu con Mèo....: style + " + style);
    }

    @Override
    public void climb(String style) {
        System.out.println("Con mèo trèo cây : " + style);
    }
}
