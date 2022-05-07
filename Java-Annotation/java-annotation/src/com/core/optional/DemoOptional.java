package com.core.optional;

import java.util.Optional;

/**
 * @author ManhKM on 4/23/2022
 * @project java-annotation
 */
public class DemoOptional {

    public static void main(String[] args) {
        String str = null;
        Optional<String> optional = Optional.ofNullable(str);

        if(optional.isPresent()){
            System.out.println(optional.get());
        }

        optional.ifPresent(s -> System.out.println(s));

        String b = optional.orElse("Giá trị mặc định");
        b = optional.orElseGet(() -> {
            StringBuilder sb = new StringBuilder();
            return sb.toString();
        });

        /**
         * Method map() -> biến đổi đối tượng bên trong Optional
         */


    }
}
