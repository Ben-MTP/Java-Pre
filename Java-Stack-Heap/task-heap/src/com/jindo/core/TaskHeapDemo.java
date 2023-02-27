package com.jindo.core;

import com.jindo.core.entity.Student;

/**
 * @author ManhKM on 5/9/2022
 * @project task-heap
 */
public class TaskHeapDemo {

    public static void updateAge(int age){
        age += 1;
    }

    public static void main(String[] args) {
        Student student = new Student("Jim", 10);
        System.out.println(student);
        updateAge(student.getAge());
        System.out.println(student);
    }
}
