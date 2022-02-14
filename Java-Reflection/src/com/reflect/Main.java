package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @author ManhKM on 2/14/2022
 * @project Java-Reflection
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.reflect.Person");
        getClassInfo(clazz);
        getFields(clazz);
        getMethods(clazz);
    }

    public static void getClassInfo(Class clazz) {
        System.out.println(String.format("Class: %s", clazz.getName()));
        System.out.println(String.format("Package: %s", clazz.getPackage()));
        System.out.println(String.format("Modifier public: %s", Modifier.isPublic(clazz.getModifiers())));
    }

    public static void getFields(Class clazz) {
        Field[] fs = clazz.getDeclaredFields();
        for (int i = 0; i < fs.length; i++) {
            System.out.print(fs[i].getType());
            System.out.println(" " + fs[i].getName());
        }
    }

    public static void getMethods(Class clazz) {
        Method[] ms = clazz.getDeclaredMethods();
        for (int i = 0; i < ms.length; i++) {
            System.out.print(ms[i].getName());
            Parameter[] ps = ms[i].getParameters();
            for (int j = 0; j < ps.length; j++) {
                System.out.print(" " + ps[j].getParameterizedType());
                System.out.print(" " + ps[j].getName());
            }
            System.out.println();
        }
    }
}
