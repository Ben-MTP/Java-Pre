package com.jindo.core.session3.method;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class ShareMemoryTest {

    public static void main(String[] args) {

        System.out.println("Synchronized methods: ");

        ShareMemory shareMemory = new ShareMemory();

        WorkingThread thread1 = new WorkingThread(shareMemory, "Thread-01");
        WorkingThread thread2 = new WorkingThread(shareMemory, "Thread-02");
        WorkingThread thread3 = new WorkingThread(shareMemory, "Thread-03");
        WorkingThread thread4 = new WorkingThread(shareMemory, "Thread-04");
        WorkingThread thread5 = new WorkingThread(shareMemory, "Thread-05");
        WorkingThread thread6 = new WorkingThread(shareMemory, "Thread-06");
        WorkingThread thread7 = new WorkingThread(shareMemory, "Thread-07");
        WorkingThread thread8 = new WorkingThread(shareMemory, "Thread-08");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();

        System.out.println("THE END APPLICATION....");
    }
}
