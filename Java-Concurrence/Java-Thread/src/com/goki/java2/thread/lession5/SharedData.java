package com.goki.java2.thread.lession5;

/**
 * @author ManhKM on 7/2/2022
 * @project Java-Thread
 */
public class SharedData {
    public int x = 0;

    /**
     * Logic in ra toàn bộ các số từ giá trị 0 cho đến x.
     * Dải số được in ra ngoài màn hình
     */
    public synchronized void add(int data){
        x += data;
        System.out.println("\nday so x: " + x);
        for (int i = 0; i < x; i++){
            System.out.print(" " + i);
        }
    }
}
