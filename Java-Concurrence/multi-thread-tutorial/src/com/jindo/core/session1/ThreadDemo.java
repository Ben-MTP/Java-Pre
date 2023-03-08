package com.jindo.core.session1;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class ThreadDemo extends Thread{

    private Thread t;
    private String threadName;

    ThreadDemo(String name){
        this.threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try{
            for (int i = 4; i > 0; i--){
                System.out.println("Thread " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread: " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting...");
    }

    public void start(){
        System.out.println("Starting " + threadName);
        if(t == null){
            t = new Thread(this.threadName);
            t.start();
        }
    }

    public void interrupt(){
        System.out.println("Interrupt " + threadName);
        t.interrupt();
    }
}
