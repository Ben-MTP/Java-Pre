package com.core.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Hướng dẫn tạo Annotation JsonName
 * @author ManhKM on 4/23/2022
 * @project java-annotation
 */
@Retention(RetentionPolicy.RUNTIME)                                     // Tồn tại trong lúc chạy chương trình
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})      // Được sử dụng trên class, interface, method, biến
public @interface JsonName {
    /**
     * Các giá trị trong @interface đều dạng hàm abstract, không có tham số
     * @return
     */
    String value();
}
