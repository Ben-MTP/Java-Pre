package com.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author ManhKM on 4/23/2022
 * @project Java-Reflection
 */
public class ReflectMethod {
    public static void main(String[] args) {
        Class<Girl> girlClass = Girl.class;

        Method[] methods = girlClass.getDeclaredMethods();

        for (Method method: methods) {
            System.out.println();
            System.out.println("Method: " + method.getName());
            System.out.println("Parameters: " + Arrays.toString(method.getParameters()));
        }

        try {
            Method methodSetName = girlClass.getMethod("setName", String.class);
            Girl girl = new Girl();

            methodSetName.invoke(girl, "Ngọc Trinh");
            System.out.println(girl);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
