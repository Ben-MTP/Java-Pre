package com.manhkm.sync;

/**
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class WorkingThread extends Thread{
    private ShareMemory mShareMemory;
    private String mThreadName;

    // Constructor:
    public WorkingThread(ShareMemory sm, String threadName){
        this.mShareMemory = sm;
        this.mThreadName  = threadName;
    }

    @Override
    public void run() {
        mShareMemory.printData(mThreadName);
    }
}
