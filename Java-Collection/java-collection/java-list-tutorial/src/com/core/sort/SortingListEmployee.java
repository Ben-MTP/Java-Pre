package com.core.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ManhKM on 8/25/2022
 * @project java-collection
 */
public class SortingListEmployee {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee("ManhKM", 18, 9000));
        employeeList.add(new Employee("ManhKM1", 15, 9001));
        employeeList.add(new Employee("ManhKM2", 18, 9002));
        employeeList.add(new Employee("ManhKM3", 16, 9003));
        employeeList.add(new Employee("ManhKM4", 12, 9004));

        System.out.println("ListData Before Sorting: ");

        for (Employee item: employeeList) {
            System.out.println(item.toString());
        }

        Collections.sort(employeeList);

        System.out.println("ListData After Sorting: ");

        for (Employee item: employeeList) {
            System.out.println(item.toString());
        }
    }
}
