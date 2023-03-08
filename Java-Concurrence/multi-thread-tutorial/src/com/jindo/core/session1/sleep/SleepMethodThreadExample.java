package com.jindo.core.session1.sleep;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class SleepMethodThreadExample extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SleepMethodThreadExample thread1 = new SleepMethodThreadExample();
        thread1.start();
    }
}
