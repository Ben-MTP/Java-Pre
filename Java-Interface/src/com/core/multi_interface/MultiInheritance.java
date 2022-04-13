package com.core.multi_interface;

/**
 * @author ManhKM on 4/12/2022
 * @project Java-Interface
 */
public class MultiInheritance implements Interface1, Interface2{

    public MultiInheritance(){

    }

    @Override
    public void doSomething() {
        Interface1.super.doSomething();
        Interface2.super.doSomething();
//        Interface2.super.doSomething();
    }

}
