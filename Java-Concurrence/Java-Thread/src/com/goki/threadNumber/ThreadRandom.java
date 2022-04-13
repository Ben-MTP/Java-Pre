package com.goki.threadNumber;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hàm thực hiện sinh giá trị ngẫu nhiên trong khoảng nào đó.
 * @author ManhKM on 4/11/2022
 * @project Java-Thread
 */
public class ThreadRandom extends Thread{
    ShareData shareData;

    public ThreadRandom(ShareData shareData){
        this.shareData = shareData;
    }

    /**
     * Hàm run() -> thực hiện sinh các số random.
     */
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Logger.getLogger(ThreadRandom.class.getName()).log(Level.SEVERE, null, e);
        }

        Random random = new Random();
        for (int i = 0; i < 10; i++){
            synchronized (shareData){
                int rad = random.nextInt(100) + 1;
                shareData.setRad(rad);
                System.out.println("Rad : " + rad);
                shareData.notifyAll();
                try {
                    shareData.wait();
                } catch (InterruptedException e) {
                    Logger.getLogger(ThreadRandom.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }

        System.out.println("T1 Stop");
        shareData.notifyAll();
    }
}
