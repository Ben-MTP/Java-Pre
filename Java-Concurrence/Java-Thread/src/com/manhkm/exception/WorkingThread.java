package com.manhkm.exception;

import java.util.Random;

/**
 * @author ManhKM on 4/5/2022
 * @project Java-Thread
 */
public class WorkingThread implements Runnable{

    @Override
    public void run() {
        while (true){
            processSomething();
        }
    }

    private void processSomething() {
        try {
            System.out.println("-----> Processing working thread");
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Random r = new Random();
        int i = r.nextInt(100);
        if(i > 70){
            throw new RuntimeException("-----> Xử lý ngoại lệ trong thread");
        }
    }
}
