package com.utils;

import java.lang.reflect.Field;

/**
 * @author ManhKM on 10/19/2022
 * @project Java-Reflection
 */
public class ReflectUtils {
    public static boolean set(Object object, String fieldName, Object fieldValue){
        Class<?> clazz = object.getClass();
        if(clazz != null){
            try{
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                field.set(object, fieldValue);
                return true;
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
                clazz = clazz.getSuperclass();
            }
        }
        return false;
    }

    public static Object get(Object object, String fieldName){
        Class<?> clazz = object.getClass();
        if(clazz != null){
            try{
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                return field.get(object);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
                clazz = clazz.getSuperclass();
            }
        }
        return null;
    }
}
