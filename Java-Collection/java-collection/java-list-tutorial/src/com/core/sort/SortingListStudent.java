package com.core.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ManhKM on 8/25/2022
 * @project java-collection
 */
public class SortingListStudent {

    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Hoa", 11, 100));
        studentList.add(new Student("Manh", 12, 100));
        studentList.add(new Student("Yen", 19, 100));
        studentList.add(new Student("Duong", 21, 100));
        studentList.add(new Student("Hau", 10, 100));

        System.out.println("Before sorting: " + studentList);

        Collections.sort(studentList, new StudentAgeComparator());

        System.out.println("After sorting: " + studentList);


    }

}
