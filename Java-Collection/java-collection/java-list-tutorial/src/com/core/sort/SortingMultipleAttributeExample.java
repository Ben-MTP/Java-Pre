package com.core.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ManhKM on 8/25/2022
 * @project java-collection
 */
public class SortingMultipleAttributeExample {

    public static void main(String[] args) {
        System.out.println("========== SORTING BY MULTIPLE ATTRIBUTES =========");

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Tom", "School1", 11, 100));
        studentList.add(new Student("Sam", "School4", 15, 100));
        studentList.add(new Student("Peter", "School4", 11, 100));
        studentList.add(new Student("Tim", "School5", 11, 100));
        studentList.add(new Student("Anne", "School1", 11, 100));
        studentList.add(new Student("John", "School1", 11, 100));
        studentList.add(new Student("Bill", "School1", 11, 100));
        studentList.add(new Student("Jane", "School1", 11, 100));
        studentList.add(new Student("Alice", "School1", 11, 100));
        studentList.add(new Student("David", "School1", 11, 100));
        studentList.add(new Student("Jane", "School1", 11, 100));
        studentList.add(new Student("Antony", "School1", 11, 100));
        studentList.add(new Student("JKen", "School1", 11, 100));
        studentList.add(new Student("Black", "School1", 11, 100));

        System.out.println("***** Before Sorting *****");
        for (Student item: studentList) {
            System.out.println(item);
        }

        Collections.sort(studentList, new StudentChainedComparator(
            new StudentAgeComparator(),
            new StudentSalaryComparator(),
            new StudentSchoolComparator()));

        System.out.println("***** After Sorting *****");
        for (Student item: studentList) {
            System.out.println(item);
        }
    }

}
