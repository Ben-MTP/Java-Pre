package com.gpcoder.reflect;

import java.lang.annotation.Annotation;

/**
 * @author ManhKM on 10/25/2022
 * @project Java-Reflection
 */
@MyAnnotation(name = "Table", value = "Employee")
public class ClassAnnotationExample {

    public static void main(String[] args) {
        Class<?> aClazz = ClassAnnotationExample.class;

        Annotation[] annotations = aClazz.getAnnotations();

        for (Annotation ann : annotations){
            System.out.println("Annotation: " + ann.annotationType().getSimpleName());
        }
    }
}
