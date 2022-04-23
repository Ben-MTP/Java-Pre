package com.core.thread.loda;

/**
 * @author ManhKM on 4/23/2022
 * @project Java-Thread-Pool
 */
public class RequestHandler implements Runnable{
    String name;
    public RequestHandler(String name){
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+ " Starting process " + name);
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + " Finished process " + name);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
