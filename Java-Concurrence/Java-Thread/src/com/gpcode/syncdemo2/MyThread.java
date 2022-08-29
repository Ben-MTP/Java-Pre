package com.gpcode.syncdemo2;

/**
 * @author ManhKM on 3/8/2022
 * @project Java-Thread
 */
public class MyThread extends Thread{
    private String name;
    private int value;

    public MyThread(String name, int value){
        this.name = name;
        this.value = value;
    }

    public void run(){
        Table.print(name, value);
    }
}
