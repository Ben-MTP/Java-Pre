package com.jindo.core.session3.deadlock;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class DeadLockTest {

    public static void main(String[] args) throws InterruptedException {

        Object obj1 = new String("object1");
        Object obj2 = new String("object2");
        Object obj3 = new String("object3");

        DeadlockThread thread1 = new DeadlockThread("Thread-01", obj1, obj2);
        DeadlockThread thread2 = new DeadlockThread("Thread-02", obj2, obj3);
        DeadlockThread thread3 = new DeadlockThread("Thread-03", obj3, obj1);

        thread1.start();
        Thread.sleep(1000);

        thread2.start();
        Thread.sleep(1000);

        thread3.start();
        Thread.sleep(1000);

        System.out.println("Ending Main Thread");
    }
}
