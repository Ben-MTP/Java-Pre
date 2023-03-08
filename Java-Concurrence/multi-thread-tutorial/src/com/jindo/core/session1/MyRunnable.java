package com.jindo.core.session1;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class MyRunnable implements Runnable, MyInterface{

    @Override
    public void sayHello() {

    }

    @Override
    public void run() {
        System.out.println("Method run() in MyRunnable");
    }

    @Override
    public void go() {

    }

    @Override
    public void speak() {

    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
