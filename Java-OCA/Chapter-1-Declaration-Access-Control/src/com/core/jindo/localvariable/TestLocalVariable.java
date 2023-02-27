package com.core.jindo.localvariable;

/**
 * @author ManhKM on 6/3/2022
 * @project Java-OCA
 */
public class TestLocalVariable {
    int count = 9;

    public void logIn(){
        int count = 10;
        System.out.println("local variable count is " + count);
    }

    public void count(){
        System.out.println("instance variable count is " + count);
    }

    public static void main(String[] args){
        new TestLocalVariable().logIn();
        new TestLocalVariable().count();
    }
}
