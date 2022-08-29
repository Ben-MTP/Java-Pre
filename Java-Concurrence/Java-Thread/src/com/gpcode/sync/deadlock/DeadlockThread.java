package com.gpcode.sync.deadlock;

/**
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class DeadlockThread implements Runnable{

    private Object obj1;
    private Object obj2;

    public DeadlockThread(Object o1, Object o2){
        this.obj1 = o1;
        this.obj2 = o2;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " acquiring lock on " + obj1);

        synchronized (obj1){
            System.out.println(name + " acquired lock on " + obj1);
            work();

            System.out.println(name + " acquiring lock on " + obj2);
            synchronized (obj2){
                System.out.println(name + " released lock on " + obj2);
                work();
            }
            System.out.println(name + " released lock on " + obj2);
        }
        System.out.println(name + " released lock on " + obj1);
        System.out.println(name + " finished execution.");
    }

    private void work() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
