package com.msoft.javajob.basic.multi.banking;

/**
 * @author ManhKM on 8/29/2022
 * @project Java-Task
 */
public class WithdrawTask implements Runnable{

    private Account acct;
    private long mount;

    public WithdrawTask(Account acct, long mount){
        this.acct = acct;
        this.mount = mount;
    }

    @Override
    public void run() {
        try {
            this.acct.withdraw(this.mount);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
