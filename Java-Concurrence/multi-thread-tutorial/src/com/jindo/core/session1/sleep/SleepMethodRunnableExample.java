package com.jindo.core.session1.sleep;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class SleepMethodRunnableExample implements Runnable{

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
        SleepMethodRunnableExample runnable1 = new SleepMethodRunnableExample();
        Thread thread = new Thread(runnable1);
        thread.start();
    }
}
