package com.reflect;

import com.sun.istack.internal.Nullable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author ManhKM on 4/23/2022
 * @project Java-Reflection
 */
@SuppressWarnings("deprecation")
@Deprecated
public class ReflectAnnotation {
    private String name;

    public ReflectAnnotation() {

    }

    public ReflectAnnotation(String name) {
        this.name = name;
    }

    @Nullable
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Class<Girl> girlClass = Girl.class;
        System.out.println("Class: "+girlClass.getSimpleName()); // Lấy ra tên Class
        for(Annotation annotation : girlClass.getDeclaredAnnotations()){
            System.out.println("Annotation: " + annotation.annotationType()); // Lấy ra tên các Annatation trên class này
        }

        for(Method method: girlClass.getDeclaredMethods()){ // Lấy ra các method của class
            System.out.println("\nMethod: " + method.getName()); //Tên method
            for(Annotation annotation : method.getAnnotations()){
                System.out.println("Annotation: " + annotation.annotationType()); // Lấy ra tên các Annatation trên method này
            }
        }
    }
}
