package com.core.sort;

import java.util.Comparator;

/**
 * @author ManhKM on 8/25/2022
 * @project java-collection
 */
public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getAge() - o2.getAge();
        return result;
    }
}
