package com.goki.java2.thread.lession4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ManhKM on 6/30/2022
 * @project Java-Thread
 * -----
 * Thực hiện logic in ra màn hình giá trị từ 0 đến 9
 * Mỗi lần in cách nhau 1s
 *
 * Cách 1: khởi tạo Thread thông qua việc implement Interface Runnable
 */
public class ThreadThree implements Runnable{

    private String name;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Logger.getLogger(ThreadThree.class.getName()).log(Level.SEVERE, null, e);
            }
            System.out.println(this.name + " >> " + i);
        }
    }

    public ThreadThree(String name){
        this.name = name;
    }
}
