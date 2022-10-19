package com.gpcoder.reflect;

import com.gpcoder.reflect.Cat;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ManhKM on 10/19/2022
 * @project Java-Reflection
 * -----
 * Lấy các thông tin của Constructor của một Class:
 */
public class ReflectConstructorExample {

    public static void main(String[] args)
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // Lấy ra đối tượng Class mô tả class Cat:
        Class<Cat> aClass = Cat.class;

        // Lấy ra cấu từ có tham số (String, int) của class cat:
        Constructor<?> constructor = aClass.getConstructor(String.class, int.class);

        // Lấy ra thông tin kiểu tham số của Constructor:
        System.out.println("Params: ");
        Class<?>[] paramClasses = constructor.getParameterTypes();
        for (Class<?> paramClass : paramClasses){
            System.out.println("+ " + paramClass.getSimpleName());
        }

        // Khởi tạo đối tượng Cat theo cách thông thường:
        Cat tom = new Cat("Tom", 1);
        System.out.println("Cat 1: " + tom.getName() + ", age = " + tom.getAge());

        // Khởi tạo đối tượng Cat theo cách của Reflect:
        Cat tom2 = (Cat) constructor.newInstance("Tom", 2);
        System.out.println("Cat 2: " + tom2.getName() + ", age = " + tom2.getAge());
    }
}
