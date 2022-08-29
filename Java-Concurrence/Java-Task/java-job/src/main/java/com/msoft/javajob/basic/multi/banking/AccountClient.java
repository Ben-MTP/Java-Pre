package com.msoft.javajob.basic.multi.banking;

/**
 * @author ManhKM on 8/29/2022
 * @project Java-Task
 */
public class AccountClient {

    public static void main(String[] args) {
        Account a = new Account("manhkm", 15);

        // Số tiền thực hiện rút:
        Long amount = 10L;

        Runnable task1 = new WithdrawTask(a, amount);
        Thread t1 = new Thread(task1);

        Runnable task2 = new WithdrawTask(a, amount);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}
