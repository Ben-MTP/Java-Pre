package com.gpcode.flow;

/**
 * @author ManhKM on 4/5/2022
 * @project Java-Thread
 * -----
 * Flow của phần gọi qua Runnable cũng tương tự như với Thread thôi, không có gì cả
 * Thay vì gọi qua lớp triển khai của Runnable -> thì gọi thẳng luôn vào Runnable
 * Thread thì cũng từ Rannable mà ra
 * Dùng Runnable -> dễ để đưa vào ThreadPool hơn nhiều -> core
 */
public class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo(String threadName){
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for(int i = 4; i > 0; i--){
                System.out.println("Thread: " + threadName + ", " + i);
                t.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    /**
     * Hàm thực hiện call start().
     */
    public void start(){
        System.out.println("Starting " + threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
