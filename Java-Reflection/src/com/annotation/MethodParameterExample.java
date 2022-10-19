package com.annotation;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author ManhKM on 10/19/2022
 * @project Java-Reflection
 */
public class MethodParameterExample {

    @MyRequestMapping(value = "/doMethod", method = "GET")
    protected void doMethod(@MyParam(value = "paramName") String paramValue){

    }

    public void printAnnotation(String methodName, Class... paramTypes)
        throws NoSuchMethodException {
        Class<?> aClass = getClass();

        // Lấy đối tượng method:
        Method method = aClass.getDeclaredMethod(methodName, paramTypes);

        // Lấy ra các danh sách Annotation của method:
        MyRequestMapping requestMapping = method.getAnnotation(MyRequestMapping.class);
        System.out.println(String.format("Method: %s | %s", requestMapping.value(), requestMapping.method()));

        // Lấy ra danh sách các Parameter của method:
        Parameter[] parameters = method.getParameters();
        for (Parameter parameter : parameters){
            MyParam myParam = parameter.getAnnotation(MyParam.class);
            System.out.println(myParam.value() + ": " + parameter.getName());
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        new MethodParameterExample().printAnnotation("doMethod", String.class);
    }
}
