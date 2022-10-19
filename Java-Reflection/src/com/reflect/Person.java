package com.reflect;

import java.util.Date;

/**
 * @author ManhKM on 8/1/2022
 * @project Java-Reflection
 */
public class Person {
    public String name;
    protected String address;
    private Date birthday;

    public void sayHello(String str1, String str2){
        System.out.println(this.name + ", " + str1 + " " + str2);
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return
            (name==null?"":name) + " " +
                (address==null?"":address) + " " +
                (birthday==null?"":birthday.toString());
    }
}
