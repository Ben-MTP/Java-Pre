package com.jindo.core.kethua2.a;

import com.jindo.core.kethua2.b.B;

/**
 * @author ManhKM on 8/31/2022
 * @project java-oop
 */
public class A {
    protected static int count = 0;
    public void inc(){
        count++;
    }

    public static void main(String[] args){
        A a = new B();
        a.inc();
        System.out.println(A.count);
    }
}
