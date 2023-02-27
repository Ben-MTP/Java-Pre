package com.gpcoder.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author ManhKM on 10/19/2022
 * @project Java-Reflection
 * -----
 * Được sử dụng ReflectClass để lấy các thông tin của lớp được chỉ định
 */
public class ReflectClassExample {

    public static void main(String[] args) {
        try {
            getClassInfo();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void getClassInfo() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.gpcoder.reflect.Cat");
        System.out.println("Name: " + aClass.getName());
        System.out.println("Simple Name: " + aClass.getSimpleName());

        Package pkg = aClass.getPackage();
        System.out.println("Package Name = " + pkg.getName());

        // Modifier:
        int modifiers = aClass.getModifiers();
        boolean isPublic = Modifier.isPublic(modifiers);
        boolean isInterface = Modifier.isInterface(modifiers);
        boolean isAbstract = Modifier.isAbstract(modifiers);
        boolean isFinal = Modifier.isFinal(modifiers);

        System.out.println("Is Public?" + isPublic);
        System.out.println("Is Final?" + isFinal);
        System.out.println("Is Interface?" + isInterface);
        System.out.println("Is Abstract?" + isAbstract);

        // Lấy ra đối tượng class mô tả class cha của class Cat:
        Class<?> aSuperClass = aClass.getSuperclass();
        System.out.println("Simple Class Name of Supper Class = " + aSuperClass);

        // Lấy ra mảng các Class mô tả các Interface của Class Cat:
        System.out.println("\n Interface: ");
        Class<?>[] itfClasses = aClass.getInterfaces();
        for (Class<?> itfClass : itfClasses){
            System.out.println("+ " + itfClass.getSimpleName());
        }

        // Lấy ra danh sách các constructor của Cat:
        System.out.println("\n Constructor: ");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors){
            System.out.println("+ " + constructor.getName() + " has " + constructor.getParameterCount() + " param");
        }

        // Lấy ra danh sách các method public của Cat
        // Bao gồm cả method thừa kế từ class cha và các interface:
        System.out.println("\n Declared Methods: ");
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods){
            System.out.println("+ " + method.getName());
        }

        // Lấy ra các danh sách field public:
        // Kể cả các public field thừa kế từ class class cha và các interface:
        System.out.println("\n Field: ");
        Field[] fields = aClass.getFields();
        for (Field field : fields){
            System.out.println("+ " + field.getName());
        }

        // Lấy ra danh sách các Annotation của Class:
        System.out.println("\n Annotation: ");
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations){
            System.out.println("+ " + annotation.annotationType().getSimpleName());
        }

    }
}
