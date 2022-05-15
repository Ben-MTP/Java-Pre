package com.jindo.core.customexception;

/**
 * @author ManhKM on 5/15/2022
 * @project java-exception
 */
public class TestCustomException {
    public static void main(String[] args) {
        System.out.println("-----> Running TestCustomException....");
        String name = "abc1.txt";
        if(name != "abc.txt"){
            try {
                throw new IncorrectFileNameException("Tên không chính xác: " + name);
            } catch (IncorrectFileNameException e) {
                e.printStackTrace();
            }
        }
    }
}
