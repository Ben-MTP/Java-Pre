package com.manhkm.info;

/**
 * @author ManhKM on 4/5/2022
 * @project Java-Thread
 */
public class MainWorkingThread {
    public static void main(String[] args) {
        WorkingThread workingThread = new WorkingThread("Alarm Sync File");
        workingThread.start();
    }
}
