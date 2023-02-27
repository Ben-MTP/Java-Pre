package com.goki.java2.thread.lession5;

import java.util.Random;

/**
 * @author ManhKM on 7/2/2022
 * @project Java-Thread
 */
public class CustomThread extends Thread{
    SharedData data;
    String nameThread;

    public CustomThread(SharedData sharedData, String nameThread){
        this.data = sharedData;
        this.nameThread = nameThread;
    }

    /**
     * Thực hiện mỗi lần chạy sẽ tự động thêm vào dữ liêu của ShareData một giá trị nhất định.
     * Giá trị này được sinh ngẫu nhiên theo hàm Random
     */
    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < 10; i++){
            int rad = random.nextInt(5) + 1;
            data.add(rad);
        }
    }

    @Override
    public String toString() {
        return "CustomThread{" +
                "data=" + data +
                ", nameThread='" + nameThread + '\'' +
                '}';
    }
}
