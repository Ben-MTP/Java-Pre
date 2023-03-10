package com.jindo.core.session4.threadpool;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class WorkerThread implements Runnable{

    private String task;
    private String threadName;
    private Thread thread;

    public WorkerThread(String threadName, String task){
        this.task = task;
        this.threadName = threadName;
        System.out.println("CREATING... " + this.threadName + " " + this.task);
    }

    @Override
    public void run() {
        System.out.println("RUNNING... " + this.threadName + " " + this.task);
        processCommand();
        System.out.println("FINISHED... " + this.threadName + " " + this.task);

    }

    private void processCommand() {
        try {
            System.out.println("     ...PROCESSING... ");
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        System.out.println("STARTING... " + this.threadName + " " + this.task);
        if(thread == null){
            thread = new Thread(this, this.threadName);
            thread.start();
        }
    }


}
