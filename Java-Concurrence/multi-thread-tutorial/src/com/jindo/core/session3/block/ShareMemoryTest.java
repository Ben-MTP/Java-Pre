package com.jindo.core.session3.block;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class ShareMemoryTest {

    public static void main(String[] args) {
        System.out.println("Share Memory - Synchronized Block");

        ShareMemory shareMemory = new ShareMemory();

        WorkingThread thread1 = new WorkingThread(shareMemory, "Thread-01");
        WorkingThread thread2 = new WorkingThread(shareMemory, "Thread-02");
        WorkingThread thread3 = new WorkingThread(shareMemory, "Thread-03");
        WorkingThread thread4 = new WorkingThread(shareMemory, "Thread-04");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
