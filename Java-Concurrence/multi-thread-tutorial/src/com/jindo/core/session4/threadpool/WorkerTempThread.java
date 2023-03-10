package com.jindo.core.session4.threadpool;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class WorkerTempThread implements Runnable{

    private String task;

    public WorkerTempThread(String task){
        this.task = task;
    }

    @Override
    public void run() {
//        System.out.println("RUNNING... " + Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getName() + " Starting. Task = " + task);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " Finished.");

    }

    private void processCommand() {
        try {
//            System.out.println("     ... PROCESSING... " + Thread.currentThread().getName() + " Starting. Task = " + task);
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
