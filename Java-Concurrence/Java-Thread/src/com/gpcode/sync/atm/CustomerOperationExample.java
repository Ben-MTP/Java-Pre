package com.gpcode.sync.atm;

/**
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class CustomerOperationExample {
    public static void main(String[] args) {
        final Customer c = new Customer();

        /**
         * Tiến trình 1: Thực hiện thao tác rút tiền
         * với số tiền > số tiền hiện tại trong tài khoản
         */
        Thread t1 = new Thread(){
            public void run(){
                c.withdraw(2000);
            }
        };
        t1.start();

        /**
         * Tiến trình 2: Thực hiện thao tác nộp tiền vào trong tài khoản
         * TH1 -> chưa đủ so với số tiền rút.
         * TH2 -> số tiền >= số tiền hiện tại.
         */
        Thread t2 = new Thread(){
            public void run(){
                c.deposit(500);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                c.deposit(3000);
            }
        };
        t2.start();
    }
}
