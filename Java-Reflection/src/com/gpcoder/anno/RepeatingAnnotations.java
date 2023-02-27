package com.gpcoder.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * @author ManhKM on 10/25/2022
 * @project Java-Reflection
 */
public class RepeatingAnnotations {

    // 1. Declare a Repeatable Annotation Type
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filter {
        String value();
    };

    // 2. Declare the Nested Annotation Type
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters {
        Filter[] value();
    }

    // 3. Use repeating annotations
    @Filters({ @Filter("filter1"), @Filter("filter2") })
    public interface Filterable {

    }

    public static void main(String[] args) {
        // 4. Retrieving Annotations via the Filters class
        Filters filters = Filterable.class.getAnnotation(Filters.class);
        for (Filter filter : filters.value()) {
            System.out.println(filter.value());
        }
    }
}
