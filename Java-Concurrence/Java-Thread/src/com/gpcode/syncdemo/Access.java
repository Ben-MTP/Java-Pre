package com.gpcode.syncdemo;

/**
 * @author ManhKM on 3/8/2022
 * @project Java-Thread
 */
public class Access implements Runnable{
    String name;
    Count c;

    // khởi tạo
    public Access(String name, Count c){
        this.name = name;
        this.c = c;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 3; i++){
            System.out.println(name + " index " + i + " before " + c.value);
            c.value--;
            System.out.println(name + " index " + i + " after " + c.value);
        }
    }
}
