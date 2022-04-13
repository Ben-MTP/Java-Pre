package com.core.static_method;

/**
 * @author ManhKM on 4/12/2022
 * @project Java-Interface
 */
public interface Vehicle {
    default void print(){
        if(isValid()){
            System.out.println("Vehicle printed");
        }
    }

    static boolean isValid(){
        System.out.println("Vehicle is valid");
        return true;
    }

    void showLog();
}
