package com;

import com.utils.CommonUtils;
import java.util.Date;

/**
 * @author ManhKM on 8/1/2022
 * @project Java-Reflection
 * -----
 * Testing Java Reflection để lấy các thông tin của Class
 */
public class App {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.reflect.Person");

            CommonUtils.getFields(clazz);
            CommonUtils.getClassInfo(clazz);
            CommonUtils.getMethods(clazz);

            Object obj = CommonUtils.createObject(clazz, new String[]{"name", "address", "birthday"}, new Object[]{"ManhKM", "Thái Bình", new Date(1996, 4, 30)});

            System.out.println("Object Person: " + obj);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
