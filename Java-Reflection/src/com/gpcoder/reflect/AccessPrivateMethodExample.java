package com.gpcoder.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ManhKM on 10/25/2022
 * @project Java-Reflection
 */
public class AccessPrivateMethodExample {

    public static void main(String[] args)
        throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Cat> aClass = Cat.class;
        Method privateSetNameMethod = aClass.getDeclaredMethod("setName", String.class);

        privateSetNameMethod.setAccessible(true);

        Cat tom = new Cat("Tom");
        System.out.println("Old name = " + tom.getName());

        privateSetNameMethod.invoke(tom, "Tom Cat");
        System.out.println("New name = " + tom.getName());
    }
}
