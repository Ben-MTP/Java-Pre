package com.jindo.core.threadpool;

/**
 * @author ManhKM on 5/10/2022
 * @project Banking-synch-unsynch
 * -----
 * Khởi tạo một Object run
 *      + Chứa id: nơi định danh tiến trình có id nào đang được chạy
 */

public class Run implements Runnable{

    int id;

    public Run(int id){
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Tiến trình đang được thực thi " + id);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tiến trình đã được thực thi xong " + id);
    }
}
