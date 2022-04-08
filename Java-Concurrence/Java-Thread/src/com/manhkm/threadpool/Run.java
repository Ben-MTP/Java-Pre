package com.manhkm.threadpool;

/**
 * @author ManhKM on 3/8/2022
 * @project Java-Thread
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
        System.out.println("Tiến trình đã được thực thi " + id);
    }
}
