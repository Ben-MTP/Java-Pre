package com.jindo.core.vd2;

/**
 * @author ManhKM on 5/10/2022
 * @project Banking-synch-unsynch
 */
public class MyThread extends Thread{
    private String name;
    private int value;

    public MyThread(String name, int value){
        this.name = name;
        this.value = value;
    }

    @Override
    public void run() {
        Table.print(name, value);
    }
}
