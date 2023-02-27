package com.goki.java2.thread.lession4;

/**
 * @author ManhKM on 6/30/2022
 * @project Java-Thread
 * -----
 * Thực hiện khởi tạo đối tượng MyBank và phương thức withDraw (rút tiền)
 * Với số tiền truyền vào + tên của tiến trình thực hiện rút tiền.
 */
public class MyBank {
    private int money;

    public MyBank(int money) {
        this.money = money;
    }

    public MyBank() {
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "MyBank{" +
                "money=" + money +
                '}';
    }

    //    synchronized
    public synchronized void withDraw(int money, String threadName){
        if(money <= this.money){
            System.out.println("So tien rut: " + money + ", Thread: " + threadName);
            this.money -= money;
        } else {
            System.out.println("So tien rut vuot qua so tien hien tai," + ", Thread: " + threadName);
        }
        System.out.println("So tien hien tai: " + this.money);
    }
}
