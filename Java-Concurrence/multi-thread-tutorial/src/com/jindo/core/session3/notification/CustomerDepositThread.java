package com.jindo.core.session3.notification;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class CustomerDepositThread implements Runnable{

    private Thread thread;
    private String threadName;
    private Customer customer;
    private int money;

    CustomerDepositThread(String threadName, Customer customer, int money){
        this.threadName = threadName;
        this.customer = customer;
        this.money = money;
        System.out.println("CREATING... " + threadName + " " + customer + " " + money);
    }

    @Override
    public void run() {
        System.out.println("RUNNING... " + threadName);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.customer.deposit(this.money);
    }

    public void start(){
        System.out.println("STARTING... " + threadName);
        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
