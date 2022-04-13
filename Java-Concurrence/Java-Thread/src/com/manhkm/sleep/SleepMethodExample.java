package com.manhkm.sleep;

/**
 * @author ManhKM on 4/5/2022
 * @project Java-Thread
 */
public class SleepMethodExample extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SleepMethodExample t1 = new SleepMethodExample();
        t1.start();
    }
}
