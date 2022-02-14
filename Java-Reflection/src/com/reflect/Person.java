package com.reflect;

import java.util.Date;

/**
 * @author ManhKM on 2/14/2022
 * @project Java-Reflection
 */
public class Person {
    public String name;
    protected String address;
    private Date birthday;

    public Person() {
    }

    public Person(String name, String address, Date birthday) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
    }

    // getter-setter:
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

    public void sayHello(String str1, String str2){
        System.out.println(this.name + " - " + str1 + " - " + str2);
    }

    @Override
    public String toString() {
        return (name==null?"":name +
                address==null?"":address +
                birthday==null?"": birthday.toString());
    }
}
