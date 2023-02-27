package com.goki.java2.thread.lession4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ManhKM on 6/30/2022
 * @project Java-Thread
 * -----
 * Thực hiện khởi tạo Thread thông qua việc new trực tiếp một Thread
 */
public class Main {
    /**
     * Thread main => luồng chính => khởi tạo đầu tiên khi app chạy
     */
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
                    }
                    System.out.println("T1 >> " + i);
                }
            }
        });

        t1.start();
        /**
         * Tại thời điểm này có 2 thread đang chạy:
         * Thread t1 và Thread main
         */

        /**
         * Tạo Thread theo cách 2:
         * Sử dụng sự kế thừa của các class: ThreadTwo >> Thread
         */
        Thread t2 = new ThreadTwo("T2");
        t2.start();

        try {
            t2.join();
            /**
             * Tại thời điểm này có 3 thread >> T1, T2 và main thread
             */
        } catch (InterruptedException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }

        /**
         * Tạo Thread theo cách 3:
         * Tạo trực tiếp thông qua Object Thread3, sau đó đưa vào trong constructor của Thread.
         * Runnable >> ThreadThree
         */
        ThreadThree r = new ThreadThree("T3");
        Thread t3 = new Thread(r);
        t3.start();

        for (int i = 0; i < 15; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
            }
            System.out.println("T1 >> isAlive >> " + t1.isAlive());
            System.out.println("T2 >> isAlive >> " + t2.isAlive());
            System.out.println("T3 >> isAlive >> " + t3.isAlive());
            System.out.println("Main thread >> " + i);
        }

    }
}
