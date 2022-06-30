package com.goki.java2.lession4;

/**
 * @author ManhKM on 6/30/2022
 * @project Java-Thread
 */
public class WithDrawThread extends Thread{
    private String name;

    private MyBank myBank;

    public WithDrawThread(MyBank myBank, String name){
        this.myBank = myBank;
        this.name   = name;
    }

    @Override
    public void run() {
        this.myBank.withDraw(800, this.name);
    }
}
