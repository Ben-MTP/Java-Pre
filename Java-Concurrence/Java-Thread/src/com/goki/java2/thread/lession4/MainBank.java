package com.goki.java2.lession4;

/**
 * @author ManhKM on 6/30/2022
 * @project Java-Thread
 */
public class MainBank {
    public static MyBank tpBank = new MyBank(2000);

    public static void main(String[] args) {

        WithDrawThread t1 = new WithDrawThread(tpBank, "Rut lan 1");
        t1.start();

        WithDrawThread t2 = new WithDrawThread(tpBank, "Rut lan 2");
        t2.start();

        WithDrawThread t3 = new WithDrawThread(tpBank, "Rut lan 3");
        t3.start();

    }
}
