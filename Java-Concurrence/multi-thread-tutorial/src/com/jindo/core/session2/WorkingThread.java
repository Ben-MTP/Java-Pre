package com.jindo.core.session2;

import java.util.Random;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class WorkingThread implements Runnable {

    private String name;
    private Thread t;

    WorkingThread() {
        System.out.println("CREATING...");
    }

    WorkingThread(String name) {
        this.name = name;
        System.out.println("CREATING..." + name);
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            count++;
            processSomething(count);
        }
    }

    public void start(){
        System.out.println("STARTING..." + name);
        if(t == null){
            t = new Thread(this, name);
            t.setDaemon(true);
            t.start();
            System.out.println(t.getName());
        }
    }

    private void processSomething(int count) {
        Random random = new Random();
        int i = random.nextInt(999999);

        try {
            System.out.println(
                    "[" + i + "]" + "Processing working thread " + this.name + "[" + count + "]");
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (i == 45678) {
            throw new RuntimeException("Giá trị này = 100, không xủ lý trong Thread");
        }
    }
}
