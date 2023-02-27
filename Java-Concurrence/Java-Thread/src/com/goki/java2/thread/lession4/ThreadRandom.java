package com.goki.java2.thread.lession4;


import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ManhKM on 7/3/2022
 * @project Java-Thread
 * -----
 * Thực hiện khai báo một luồng sinh ngẫu nhiên
 */
public class ThreadRandom extends Thread{
    SharedData sharedData;

    public ThreadRandom(SharedData sharedData){
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Random random = new Random();
        /**
         * Sinh dữ liệu sau 10 lần thì dừng lại
         * Từ khóa: synchronized đặt cho biến chia sẻ.
         *     Đánh thức dựa vào biến chung
         *     Syncho trên chính Object đó
         */
        for (int i = 0; i < 10; i++){
            System.out.println(">> T1: " + i);
            synchronized (sharedData){
                int rad = random.nextInt(100) + 1;      // random: 1 -> 99
                sharedData.setRad(rad);
                System.out.println("  >> Random value: " + sharedData.getRad());
                /**
                 * Triển khai thêm, sau khi sinh xong thì đưa về trạng thái wait và đánh thức T2 để cho nó chạy
                 */
                sharedData.notifyAll();     // Đánh thức nó dậy
                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    Logger.getLogger(ThreadRandom.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
        // stop:
        synchronized (sharedData){
            sharedData.notifyAll();
        }
    }
}
