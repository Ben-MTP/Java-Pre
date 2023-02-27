package com.core.anno;

/**
 * @author ManhKM on 8/24/2022
 * @project java-annotation
 * -----
 * Single-Value Annotation
 * Một Annotation mà có một phương thwusc được gọi là single-value Annotation
 */
@interface SingleValueAnnotation {
//    int value();

    int value() default 0;
    /**
     * Áp dụng Single-Value Annotation
     * @SingleValueAnnotation(value=10)
     * Những giá trị value có thể là những giá trị khác nhau
     */
}
