package com.msoft.javajob.basic.multi;

/**
 * @author ManhKM on 8/29/2022
 * @project Java-Task
 * -----
 * Định nghĩa ra một Task có nhiệm vụ thực hiện in ra ngoài màn hình.
 * Lúc này MyTask chính là tác vụ cần xử lý.
 * MyTask cần được gắn vào một Thread để chạy.
 */
public class MyTask implements Runnable{
    private String name;
    private int time;

    public MyTask(String name, int time){
        this.name = name;
        this.time = time;
    }

    @Override
    public void run(){
        for(int i = 0; i < this.time; i++){
            System.out.print(this.name);
        }
    }
}
