package com.jindo.core.session1;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class MyThread extends Thread implements MyInterface{

    @Override
    public void sayHello() {

    }

    @Override
    public void run() {
        super.run();
        System.out.println("Method run() in MyThread");
    }

    @Override
    public void go() {

    }

    @Override
    public void speak() {

    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
