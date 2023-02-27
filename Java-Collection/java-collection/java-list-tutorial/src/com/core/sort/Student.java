package com.core.sort;

/**
 * @author ManhKM on 8/25/2022
 * @project java-collection
 */
public class Student extends Employee{

    private String schoolName;

    public Student(String name, int age, int salary) {
        super(name, age, salary);
    }

    public Student(String name, String schoolName, int age, int salary){
        super(name, age, salary);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
            "schoolName='" + this.schoolName + '\'' +
            " name="+ super.getName() +
            " age="+ super.getAge() +
            " salary="+ super.getSalary() +
            '}';
    }
}
