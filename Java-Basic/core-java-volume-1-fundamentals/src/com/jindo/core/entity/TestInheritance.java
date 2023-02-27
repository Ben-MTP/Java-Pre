package com.jindo.core.entity;

/**
 * @author ManhKM on 5/20/2022
 * @project core-java-volume-1-fundamentals
 * -----
 * + Không thể khởi tạo instance từ một Abstract Class
 * + Có thể khởi tạo thông qua một Subclass của nó
 * + Tại sao Employee.getName lại là null
 */
public class TestInheritance {
    public static void main(String[] args) {
        Person person = new Student("Vince Vu", "Economics");

        Person[] people = new Person[3];
        people[0] = new Employee("TrangTT", 1000, 1999, 12, 18);
        people[1] = new Student("TrangKT", "Information Technology");
        people[2] = person;

        for (Person p: people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
