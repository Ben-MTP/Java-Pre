package com.gpcode.sync.staticmethod;

/**
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class WorkingThread extends Thread{
    private String mThreadName;

    public WorkingThread(String mThreadName){
        this.mThreadName = mThreadName;
    }

    @Override
    public void run() {
        ShareMemory.printData(mThreadName);
    }
}
