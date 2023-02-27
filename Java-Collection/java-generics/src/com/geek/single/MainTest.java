package com.geek.single;

import com.core.Student;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 8/24/2022
 * @project java-generics
 */
public class MainTest {

    public static void main(String[] args) {

        // instance of Integer type:
        Test<Integer> iObj = new Test<Integer>(100);

        System.out.println(iObj.getObject());

        // instance of String type:
        Test<String> sObj = new Test<String>("Khong Minh Manh");

        System.out.println(sObj.getObject());

        // instance of Student type:
        Test<Student> studentObj = new Test<Student>(new Student("ManhKM","Thái Bình", 18));
        System.out.println(studentObj.getObject().toString());

        // instance of List<Student> type:
        Test<Student> studentObj1 = new Test<Student>(new Student("TrangKT","Thái Bình", 18));
        Test<Student> studentObj2 = new Test<Student>(new Student("ManhKM","Thái Bình", 18));
        Test<Student> studentObj3 = new Test<Student>(new Student("TrangTT","Hà Nam", 18));
        List<Test<Student>> listStudentObj = new ArrayList<Test<Student>>(10);
        listStudentObj.add(studentObj1);
        listStudentObj.add(studentObj2);
        listStudentObj.add(studentObj3);
        listStudentObj.add(studentObj1);

        System.out.println("List of Student: ");
        for (Test<Student> item : listStudentObj){
            System.out.println(item.getObject().toString());
        }
    }
}
