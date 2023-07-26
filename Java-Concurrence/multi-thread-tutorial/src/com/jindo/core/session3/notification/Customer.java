package com.jindo.core.session3.notification;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class Customer {

    private int balance = 1000;

    public Customer() {
        System.out.println("Tài khoản của bạn là: " + balance);
    }

    /**
     * Thực hiện giao dịch rút tiền
     *
     * @param amount
     */
    public synchronized void withdraw(int amount) {
        System.out.println("Đang thực hiện giao dịch rút tiền " + amount + " ...");
        while (balance < amount) {
            System.out.println("Không đủ số tiền trong tài khoản để rút, số dư hiện tại là: " + this.balance);
            try {
                wait(); // Chờ đến khi nạp đủ tiền
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        balance -= amount;
        System.out.println("Rút tiền thành công. Tài khoản hiện tại là: " + balance);
    }

    public synchronized void deposit(int amount) {
        System.out.println("Đang thực hiện giao dịch nạp tiền " + amount + " ...");
        balance += amount;
        System.out.println("Nạp tiền thành công. Tài khoản hiện tại của bạn là: " + balance);
        notify();   // Thông báo random thread khac
    }
}
