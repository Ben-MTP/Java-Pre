package com.manhkm.flow;

/**
 * @author ManhKM on 4/5/2022
 * @project Java-Thread
 */
public class ThreadDemo extends Thread{
    private Thread t;
    private String threadName;

    public ThreadDemo(String threadName){
        this.threadName = threadName;
    }

    /**
     * Method run()
     * Thực hiện chạy từ 4 -> 0 -> giữa mỗi lần nghỉ 50 milis giây.
     */
    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--){
                System.out.println("Thread: " + threadName + ", " + i);
                t.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Thread " + threadName + " interrupted");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    /**
     * Method start()
     * Nếu thread -> chưa khởi tạo | null
     *
     */
    public void start(){
        System.out.println("Starting " + threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
