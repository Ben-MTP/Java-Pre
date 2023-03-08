package com.jindo.core.session1.runnable;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class RunnableDemo implements Runnable{

    private Thread t;
    private String threadName;

    RunnableDemo(String threadName){
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {

        System.out.println("Creating " + threadName + " ...");
        try {
            for (int i = 1000; i > 0; i--){
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread " + threadName + " exiting.");
        }
    }

    public void start(){
        System.out.println("Starting " + threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
