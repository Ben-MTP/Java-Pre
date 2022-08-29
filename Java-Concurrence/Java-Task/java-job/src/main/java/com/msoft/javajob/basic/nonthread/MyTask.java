package com.msoft.javajob.basic.nonthread;

/**
 * @author ManhKM on 8/29/2022
 * @project Java-Task
 * -----
 * Định nghĩa ra một Task có nhiệm vụ thực hiện in ra ngoài màn hình.
 */
public class MyTask {
    private String name;
    private int time;

    public MyTask(String name, int time){
        this.name = name;
        this.time = time;
    }

    public void run(){
        for(int i = 0; i < this.time; i++){
            System.out.print(this.name);
        }
    }
}
