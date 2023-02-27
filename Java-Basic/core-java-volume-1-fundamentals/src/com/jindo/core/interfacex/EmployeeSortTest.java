package com.jindo.core.interfacex;

import com.jindo.core.entity.Employee;

import java.util.Arrays;

/**
 * @author ManhKM on 5/25/2022
 * @project core-java-volume-1-fundamentals
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("ManhKM", 35000);
        staff[1] = new Employee("AAA", 33000);
        staff[2] = new Employee("BBBB", 37000);

        Arrays.sort(staff);

        for (Employee e : staff){
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }
    }
}
