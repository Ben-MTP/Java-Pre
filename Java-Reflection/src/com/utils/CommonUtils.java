package com.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @author ManhKM on 8/1/2022
 * @project Java-Reflection
 */
public class CommonUtils {

    // get thông tin Class:
    public static void getClassInfo(Class clazz){
        System.out.println(String.format("Class: %s", clazz.getName()));
        System.out.println(String.format("Package: %s", clazz.getPackage().getName()));
        System.out.println(String.format("Modifier public: %s", Modifier.isPublic(clazz.getModifiers())));
    }

    // get thông tin các trường
    public static void getFields(Class clazz){
        Field[] fs = clazz.getDeclaredFields();

        for (int i = 0; i < fs.length; i++){
            System.out.println(fs[i].getType());
            System.out.println(" " + fs[i].getName());
        }
    }

    // get thông tin method:
    public static void getMethods(Class clazz){
        Method[] ms = clazz.getDeclaredMethods();
        for (int i = 0; i < ms.length; i++){
            System.out.println(ms[i].getName());
            Parameter[] ps = ms[i].getParameters();
            for (int j = 0; j < ps.length; j++){
                System.out.println(" " + ps[j].getParameterizedType());
                System.out.println(" " + ps[j].getName());
            }
        }
    }

    // tạo mới đối tượng:
    public static Object createObject(Class clazz, String[] fields, Object[] values){
        try {
            Object obj = clazz.newInstance();
            for(int i = 0; i < fields.length; i++){
                Field field = clazz.getDeclaredField(fields[i]);
                field.setAccessible(true);
                field.set(obj, values[i]);
            }
            return obj;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        }
    }


}
