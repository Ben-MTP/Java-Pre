package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ManhKM on 10/19/2022
 * @project Java-Reflection
 * -----
 * Annotation MyTable định danh cho một Entity tương đương 1 table như Hibernate
 * Bản chất Interface chỉ gồm các field và các method abstract
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
public @interface MyTable {
    String table();     // Tên của bảng
    String schema();    // Tên của schema chứa bảng
}
