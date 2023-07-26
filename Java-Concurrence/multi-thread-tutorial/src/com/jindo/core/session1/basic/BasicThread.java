package com.jindo.core.session1.basic;

/**
 * @author ManhKM as [ADMIN]
 * @project multi-thread-tutorial on 7/26/2023-11:09 AM (>_<)/
 * @note
 */
public class BasicThread extends Thread {

    private String name;

    public BasicThread(String name) {
        this.name = name;
    }

    /**
     * Định nghĩa sự kiện thực thi của Thread
     */
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(name + '-' + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
