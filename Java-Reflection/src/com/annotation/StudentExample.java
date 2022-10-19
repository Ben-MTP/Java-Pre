package com.annotation;

/**
 * @author ManhKM on 10/19/2022
 * @project Java-Reflection
 */
@MyTable(table = "STUDENT", schema = "QLSV")
public class StudentExample extends EntityExample{

    @MyKey
    @MyField(column = "STUDENT_ID")
    private int studentId;

    @MyField(column = "NAME")
    private String name;

    public static void main(String[] args) throws Exception {
        new StudentExample().printAnnotation("studentId", "name");
    }
}
