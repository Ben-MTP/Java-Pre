package com.core;

/**
 * @author ManhKM on 8/23/2022
 * @project java-generics
 * -----
 * Thực hiện có các chức năng: CRUD
 */
public class MyGeneric <T>{
    T obj;

    void add(T obj){
        this.obj = obj;
    }

    T get(){
        return this.obj;
    }


}
