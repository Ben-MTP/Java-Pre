package com.core.multi_interface;

/**
 * @author ManhKM on 4/12/2022
 * @project Java-Interface
 */
public interface Interface3 {
    default void doSomething(){
        System.out.println("Execute in Interface3");
    }
}
