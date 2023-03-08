package com.jindo.core.session1.priority;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class ThreadInfoPriorityExample {

    public static void main(String[] args) {
        System.out.println("Thread Main Running");

        Thread thread1 = new WorkingThread("Luồng 1");
        Thread thread2 = new WorkingThread("Luồng 2");
        Thread thread3 = new WorkingThread("Luồng 3");

        System.out.println("ID luồng 1" + thread1.getId());
        System.out.println("ID luồng 2" + thread2.getId());
        System.out.println("ID luồng 3" + thread3.getId());

        // set Priority:
        thread1.setPriority(1);
        thread2.setPriority(5);
        thread3.setPriority(10);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Thread Main Stopped");

    }
}
