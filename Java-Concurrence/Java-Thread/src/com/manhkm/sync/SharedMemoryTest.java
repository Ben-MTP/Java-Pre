package com.manhkm.sync;

/**
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class SharedMemoryTest {
    public static void main(String[] args) {
        ShareMemory sm = new ShareMemory();

        WorkingThread thread1 = new WorkingThread(sm, "Thread1");
        WorkingThread thread2 = new WorkingThread(sm, "Thread2");
        WorkingThread thread3 = new WorkingThread(sm, "Thread3");
        WorkingThread thread4 = new WorkingThread(sm, "Thread4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
