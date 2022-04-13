package com.core.multi_interface;

/**
 * @author ManhKM on 4/12/2022
 * @project Java-Interface
 */
public interface Interface2 {
    default void doSomething(){
        System.out.println("Default method doSomething() in Interface2");
    }
}
