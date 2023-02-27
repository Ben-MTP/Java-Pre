package com.core;

/**
 * @author ManhKM on 8/10/2022
 * @project java-runnable
 */
public class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ", executing run() method!");
    }
}
