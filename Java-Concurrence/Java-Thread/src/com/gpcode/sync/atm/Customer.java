package com.gpcode.sync.atm;

/**
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class Customer {
    private int balance = 1000;

    public Customer(){
        System.out.println("Tài khoản của bạn là: " + balance);
    }

    /**
     * Phương thức thực hiện hành vi rút tiền.
     * Nếu số tiền trong tài khoản không đủ thì sẽ không được rút.
     * nó sẽ bị waiting -> cho đến khi thỏa mãn điều kiện rút.
     * @param amount
     */
    public synchronized void withdraw(int amount){
        System.out.println("Đang thực hiện giao dịch rút tiền" + amount + "...");
        while (balance < amount){
            System.out.println("Không đủ tiền rút!!!");
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println(e.toString());
            }
        }
        balance = balance - amount;
        System.out.println("Rút tiền thành công. Tài khoản của bạn hiện tại là: " + balance);
    }

    /**
     * Thực hiện method nạp tiền vào trong tài khoản hiện tại.
     * Khi đã nạp tiền -> nó sẽ thông báo đến cho toàn bộ các tiến trình
     * Đang trong trường hợp đợi để thực hiên logic
     * @param amount
     */
    public synchronized void deposit(int amount){
        System.out.println("Đang thực hiện giao dịch nạp tiền: " + amount +"...");
        balance = balance + amount;
        System.out.println("Nạp tiền thành công. Tài khoản của bạn hiện tại là: " + balance);
        notify(); //Thông báo đã nạp tiền
    }
}
