package com.jindo.core.session3.deadlock;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class DeadlockThread implements Runnable {

    private Thread thread;
    private String threadName;
    private Object object1;
    private Object object2;

    public DeadlockThread(String threadName, Object object1, Object object2) {
        this.threadName = threadName;
        this.object1 = object1;
        this.object2 = object2;
        System.out.println("CREATING... " + threadName + " " + object1 + " " + object2);
    }

    @Override
    public void run() {
        System.out.println("RUNNING... " + threadName);
        System.out.println(threadName + " mở khóa " + object1);

        synchronized (object1){
            System.out.println(threadName + " được khóa trên " + object1);
            work();

            System.out.println(threadName + " mở khóa " + object2);
            synchronized (object2){
                System.out.println(threadName + " được khóa trên " + object2);
                work();
            }
            System.out.println(threadName + " phát hành khóa trên " + object2);
        }
        System.out.println(threadName + " phát hành khóa trên " + object1);
        System.out.println(threadName + " finished execution....");
    }

    private void work() {
        try {
            System.out.println("SLEEPING... " + threadName);
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        System.out.println("STARTING... " + threadName);
        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
