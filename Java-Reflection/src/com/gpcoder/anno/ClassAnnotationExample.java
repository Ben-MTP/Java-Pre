package com.gpcoder.anno;

import java.lang.annotation.Annotation;

/**
 * @author ManhKM on 10/19/2022
 * @project Java-Reflection
 */
@MyAnnotation(name = "Table", value = "Employee")
public class ClassAnnotationExample {

  public static void main(String[] args) {
    Class<?> aClazz = ClassAnnotationExample.class;

    // Lấy ra danh sách các Annotation của class:
    Annotation[] annotations = aClazz.getAnnotations();

    for (Annotation ann : annotations){
      System.out.println("Annotation: " + ann.annotationType());
    }

    // Hoặc lấy cụ thể:
    Annotation ann = aClazz.getAnnotation(MyAnnotation.class);
    MyAnnotation myAnn = (MyAnnotation) ann;
    System.out.println("Name = " + myAnn.name());
    System.out.println("Value = " + myAnn.value());

  }
}
