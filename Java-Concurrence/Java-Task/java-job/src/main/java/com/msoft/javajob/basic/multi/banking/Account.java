package com.msoft.javajob.basic.multi.banking;

/**
 * @author ManhKM on 8/29/2022
 * @project Java-Task
 */
public class Account {

    private String name;
    private double amount;

    public Account(String name, double amount){
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Thực hiện phương thức rút tiền trong tài khoản ngân hàng.
     * @param a
     */
    public synchronized void withdraw(double a){
        System.out.println("Số tiền ban đầu trong tài khoản: " + this.amount);
        if(this.getAmount() >= a){
            try {
                Thread.sleep(1000);
                this.setAmount(this.getAmount() - a);
                System.out.println("     Số tiền sau khi rút còn lại: " + this.amount);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Rất tiếc số tiền không đủ");
        }
    }
}
