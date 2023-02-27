package com.core;

/**
 * @author ManhKM on 8/10/2022
 * @project java-runnable
 */
public class RunnableImpl implements Runnable {

    private String name;    // name of Runnable
    private int count;      // count

    public RunnableImpl(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.print(name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n" + Thread.currentThread().getName() + ", executing run() method!");
    }
}
