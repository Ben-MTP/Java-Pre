package com.jindo.core.kethua1;

/**
 * @author ManhKM on 8/31/2022
 * @project java-oop
 */
public class KeThuaLevel {

    public static void main(String[] args) {
        C c = new C();
    }

}

class A{
    public A(){
        System.out.println("A");
    }
}

class B extends A{
    public B(){
        System.out.println("B");
    }
}

class C extends B{
    public C(){
        System.out.println("C");
    }
}
