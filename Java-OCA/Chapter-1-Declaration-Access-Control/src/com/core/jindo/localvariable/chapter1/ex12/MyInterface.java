package com.core.jindo.localvariable.chapter1.ex12;

/**
 * @author ManhKM on 6/3/2022
 * @project Java-OCA
 */
public interface MyInterface {
    // public static m1(){;}
    default void m2(){;}
    abstract int m3();
    // final short m4() {return  5;}
    // default long m5();
    static void m6(){;}
}
