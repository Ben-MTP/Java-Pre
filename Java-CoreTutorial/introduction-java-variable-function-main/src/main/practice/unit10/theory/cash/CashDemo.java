package main.practice.unit10.theory.cash;

/**
 * Thực hiện bài toán tăng giá trị tiền cho tài khoản
 *      + Khởi tạo tài khoản -> mặc định là tài khoản đó chưa có tiền -> amount = 0.
 * @author ManhKM on 2/8/2022
 * @project introduction-java-variable-function-main
 */
public class CashDemo {
    public static void main(String[] args) {
        Cash cash = new Cash(1);
        System.out.println("Trước khi nạp tiền: " + cash.toString());
        increaseCash(cash, 1000000);
        System.out.println("Sau khi nạp tiền: " + cash.toString());
    }

    private static void increaseCash(Cash cash, double increasedAmount) {
        double amount = cash.getAmount() + increasedAmount;
        cash.setAmount(amount);
    }
}

class Cash{
    private int id;
    private double amount;

    public Cash(int id){
        this.id = id;
        this.amount = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Cash{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
