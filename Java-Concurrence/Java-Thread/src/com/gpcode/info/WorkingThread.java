package com.gpcode.info;

/**
 * @author ManhKM on 4/5/2022
 * @project Java-Thread
 */
public class WorkingThread extends Thread{
    public WorkingThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.printf("Luồng: %s có độ ưu tiên là %d \n", getName(), getPriority());
        }
    }
}
