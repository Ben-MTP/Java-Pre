package com.jindo.core.session3.notification;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class CustomerOperationExample {

    public static void main(String[] args) {
        System.out.println("Starting Main Thread");

        Customer customer = new Customer();

        CustomerWithDrawThread thread1 = new CustomerWithDrawThread("Thread-01-WithDraw", customer, 2000);
        thread1.start();

        CustomerDepositThread thread2 = new CustomerDepositThread("Thread-02-Deposit", customer, 500);
        thread2.start();

        CustomerDepositThread thread3 = new CustomerDepositThread("Thread-03-Deposit", customer, 10000);
        thread3.start();

        CustomerWithDrawThread thread4 = new CustomerWithDrawThread("Thread-04-WithDraw", customer, 9000);
        thread4.start();

        System.out.println("End Main Thread");

    }
}
