package com.gpcoder.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ManhKM on 10/25/2022
 * @project Java-Reflection
 * -----
 * Ví dụ tạo một Annotation để đánh dấu các cột cần xuất dữ liệu ra file excel.
 * Annotation này có 3 thuộc tính: index để xác định vị trí xuất dữ liệu ra file excel, title để xác định tiêu đề cột,
 * description để mô tả cho cột.
 */

@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelColumn {

    int index();

    String title();

    String description() default "Default value";
}
