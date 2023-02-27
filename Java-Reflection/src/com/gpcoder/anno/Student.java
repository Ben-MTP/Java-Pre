package com.gpcoder.anno;

import java.util.Date;

/**
 * @author ManhKM on 10/25/2022
 * @project Java-Reflection
 */
public class Student {

    @ExcelColumn(index = 1, title = "#", description = "Student's id")
    private long id;

    @ExcelColumn(index = 2, title = "Tên")
    private String name;

    @ExcelColumn(index = 3, title = "Tuổi ")
    private int age;

    @ExcelColumn(index = 4, title = "Ngày sinh")
    private Date birthday;
}
