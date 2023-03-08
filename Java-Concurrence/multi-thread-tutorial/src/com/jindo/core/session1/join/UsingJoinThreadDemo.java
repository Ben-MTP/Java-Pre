package com.jindo.core.session1.join;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class UsingJoinThreadDemo extends Thread {

    Thread t;
    private String name;

    UsingJoinThreadDemo(String name) {
        this.name = name;
        System.out.println("CREATING " + name);
    }

    @Override
    public void run() {
        System.out.println("RUNNING " + name);
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public void start() {
        System.out.println("STARTING " + name);
        if (t == null) {
            t = new Thread(this, name);
            t.start();
        }
    }
}
