package com.manhkm.sync.staticmethod;

/**
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class ShareMemoryTest {
    public static void main(String[] args) {
        WorkingThread thread1 = new WorkingThread("Thread1");
        WorkingThread thread2 = new WorkingThread("Thread2");
        WorkingThread thread3 = new WorkingThread("Thread3");
        WorkingThread thread4 = new WorkingThread("Thread4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
