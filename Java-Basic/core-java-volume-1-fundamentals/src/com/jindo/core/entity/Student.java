package com.jindo.core.entity;

import com.jindo.core.interfacex.ComparableT;
import kotlin.reflect.jvm.internal.impl.descriptors.Named;

/**
 * @author ManhKM on 5/20/2022
 * @project core-java-volume-1-fundamentals
 */
public class Student extends Person{

    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(String name, String major){
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + getMajor();
    }


}
