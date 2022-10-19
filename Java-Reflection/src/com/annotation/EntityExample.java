package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author ManhKM on 10/19/2022
 * @project Java-Reflection
 */
@MyTable(table = "table", schema = "schema")
public class EntityExample {

    @MyKey
    @MyField(column = "COLUMN")
    private int column;

    public void printAnnotation(String... fields) throws Exception{
        Class<?> aClass = getClass();
        String keyColumn = "";
        String sql = "SELECT ";
        for(int i = 0; i < fields.length; i++){

            // Lấy danh sách column theo Annotation:
            Field field = aClass.getDeclaredField(fields[i]);
            MyField fieldAnn = field.getAnnotation(MyField.class);
            sql += fieldAnn.column() + ", ";

            // Tìm trường có chứa annotation MyKey:
            Annotation[] fieldAnns = field.getAnnotations();
            for (Annotation anno : fieldAnns){
                if(anno instanceof MyKey){
                    keyColumn = fieldAnn.column();
                    break;
                }
            }
        }

        if(fields.length > 0){
            sql = sql.substring(0, sql.length() - 2);
        }

        // Lấy annotation của Class:
        MyTable myAnn = aClass.getAnnotation(MyTable.class);
        sql += String.format(" FROM %s.%s WHERE 1 = 1", myAnn.schema(), myAnn.table());
        System.out.println("Primary key: " + keyColumn);
        System.out.println("SQL: " + sql);
    }

    public static void main(String[] args) throws Exception {
        new EntityExample().printAnnotation("column");
    }
}
