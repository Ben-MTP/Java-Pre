package com.core.anno;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author ManhKM on 4/23/2022
 * @project java-annotation
 */
public class JsonNameProcessor {
    public static String toJson(Object object) throws IllegalAccessException {
        StringBuilder sb = new StringBuilder(); // Dùng StringBuilder de tao json tu class

        Class<?> clazz = object.getClass();
        JsonName jsonClassName = clazz.getDeclaredAnnotation(JsonName.class); // Lay ra annotation @JsonName tren Class

        sb.append("{\n")
                .append("\t\"")
                // Lay gia tri cua Annotation, neu annotation la null thi lay ten Class de thay the
                .append(Optional.ofNullable(jsonClassName).map(JsonName::value).orElse(clazz.getSimpleName()))
                .append("\": {\n"); //


        Field fields[] = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true); // Set setAccessible = true. De co the truy cap vao private field
            JsonName jsonFieldName = fields[i].getDeclaredAnnotation(JsonName.class); // get annotation tren field
            sb.append("\t\t\"")
                    // Lay gia tri cua Annotation, neu annotation la null thi lay ten field thay the
                    .append(Optional.ofNullable(jsonFieldName).map(JsonName::value).orElse(fields[i].getName())) // L
                    .append("\": ")
                    // Neu field la String hoac Object. thi append dau ngoac kep vao
                    .append(fields[i].getType() == String.class || !fields[i].getType().isPrimitive() ? "\"" : "")
                    // Lay gia tri cua field
                    .append(fields[i].get(object))
                    // Neu field la String hoac Object. thi append dau ngoac kep vao
                    .append(fields[i].getType() == String.class || !fields[i].getType().isPrimitive()? "\"" : "")
                    // Nếu là field cuối cùng, thì không append dấu ","
                    .append(i != fields.length -1 ? ",\n" : "\n");
        }
        sb.append("\t}\n");
        sb.append("}");

        return sb.toString();
    }

    public static void main(String[] args) throws IllegalAccessException {
        SuperMan superMan = new SuperMan(); // Tao doi tuong super man
        superMan.setDateOfBirth(LocalDateTime.now());
        superMan.setName("loda");

        String json =JsonNameProcessor.toJson(superMan);
        System.out.println(json);
    }
}
