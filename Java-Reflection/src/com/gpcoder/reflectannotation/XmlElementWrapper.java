package com.gpcoder.reflectannotation;

/**
 * @author ManhKM on 10/19/2022
 * @project Java-Reflection
 */

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ ElementType.FIELD })
@Inherited
@Retention(RetentionPolicy.RUNTIME)

/**
 * XmlElementWrapper: là một Annotation sử dụng để đánh dấu đây là một phần cha và giá trị của nó là một Collection (có chứa tài liệu xml con).
 */

public @interface XmlElementWrapper {
  String name();
}
