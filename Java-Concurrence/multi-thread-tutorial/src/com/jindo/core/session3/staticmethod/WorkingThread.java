package com.jindo.core.session3.staticmethod;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class WorkingThread extends Thread {

    private Thread thread;
    private ShareMemory shareMemory;
    private String threadName;

    public WorkingThread(ShareMemory shareMemory, String threadName) {
        this.shareMemory = shareMemory;
        this.threadName = threadName;
        System.out.println("CREATING...[" + this.threadName + "]" + " - " + shareMemory);
    }

    @Override
    public void run() {
        System.out.println("RUNNING...[" + this.threadName + "]");
        this.shareMemory.printData(this.threadName);
    }

//    public void start() {
//        System.out.println("STARTING...[" + this.threadName + "]");
//        if (thread == null) {
//            thread = new Thread(this, threadName);
//            thread.start();
//        }
//    }
}
