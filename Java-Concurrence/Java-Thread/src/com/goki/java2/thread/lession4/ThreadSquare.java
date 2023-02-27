package com.goki.java2.thread.lession4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ManhKM on 7/3/2022
 * @project Java-Thread
 * -----
 * Hàm sinh số bình phương
 */
public class ThreadSquare extends Thread{
    SharedData sharedData;

    public ThreadSquare(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        /**
         * Cũng phải loop 10 lần
         * ---- Đồng bộ luồng với biến được chia sẻ
         */
        for (int i = 0; i < 10; i++){
            System.out.println(">> T2: " + i);
            synchronized (sharedData){
                try {
                    sharedData.notifyAll(); // Đánh thức các tiến trình khác
                    sharedData.wait();      // Đợi cho đến khi đánh thức

                } catch (InterruptedException e) {
                    Logger.getLogger(ThreadSquare.class.getName()).log(Level.SEVERE, null, e);
                }
                int rad = sharedData.getRad();
                rad *= rad;
                System.out.println("    >> PT: " + rad);
            }
        }
        // stop:
        synchronized (sharedData){
            sharedData.notifyAll();
        }
    }
}
