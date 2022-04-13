package com.goki.threadNumber;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Thread thực hiện việc bình phương dữ liệu trả về từ Random.
 * @author ManhKM on 4/11/2022
 * @project Java-Thread
 */
public class ThreadSquare extends Thread{
    ShareData shareData;

    public ThreadSquare(ShareData shareData){
        this.shareData = shareData;
    }

    /**
     * Thực hiện bình phương số đã trả về từ Random.
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            synchronized (shareData){
                try {
                    shareData.notifyAll();
                    shareData.wait();
                } catch (InterruptedException e) {
                    Logger.getLogger(ThreadSquare.class.getName()).log(Level.SEVERE, null, e);
                }
                int rad = shareData.getRan();
                rad *= rad;
                System.out.println("PT: " + rad);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Logger.getLogger(ThreadRandom.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
        System.out.println("T2 Stop");
        synchronized (shareData){
            shareData.notifyAll();
        }
    }
}
