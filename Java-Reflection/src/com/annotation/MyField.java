package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ManhKM on 10/19/2022
 * @project Java-Reflection
 * -----
 * Annotation Field định danh cho một field là column của table
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
public @interface MyField {
    String column();    // Tên của cột trong bảng thuộc schema
}
