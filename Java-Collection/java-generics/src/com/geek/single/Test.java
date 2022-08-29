package com.geek;

/**
 * @author ManhKM on 8/24/2022
 * @project java-generics
 */
public class Test <T>{

    T obj;

    /**
     * Định nghĩa một Constructor
     * @param obj
     */
    Test(T obj){
        this.obj = obj;
    }

    public T getObject(){
        return this.obj;
    }
}
