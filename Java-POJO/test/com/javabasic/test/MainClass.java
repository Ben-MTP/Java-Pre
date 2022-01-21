package com.javabasic.test;

import com.javabasic.pojo.Employee;

/**
 * @author ManhKM on 1/21/2022
 * @project Java-POJO
 */
public class MainClass {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setId(100);
        obj.setName("Khong Minh Manh");
        obj.setSal(1000);

        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getSal());
    }
}
