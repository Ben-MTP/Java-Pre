package com.gpcoder.reflect;

import java.lang.reflect.Field;

/**
 * @author ManhKM on 10/25/2022
 * @project Java-Reflection
 */
public class AccessPrivateFieldExample {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Class<Cat> aClazz = Cat.class;

        // Duyệt toàn bộ các Field trong Class:
        for (Field item : aClazz.getDeclaredFields()){
            item.setAccessible(true);
        }

        Field privateNameField = aClazz.getDeclaredField("name");
        Field privateAgeField  = aClazz.getDeclaredField("age");

        privateNameField.setAccessible(true);

        Cat tom = new Cat("Tom");

        String fieldValue = (String) privateNameField.get(tom);
        System.out.println("Value field name = " + fieldValue);

        privateNameField.set(tom, "Tom Cat");
        System.out.println("New name = " + tom.getName());

    }
}
