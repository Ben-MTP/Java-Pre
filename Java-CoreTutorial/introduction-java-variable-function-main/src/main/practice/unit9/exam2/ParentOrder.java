package main.practice.unit9.exam2;

/**
 * ParentOrder -> class cha chứa method và phương thức tính tổng giá trị
 *      + Giá trị = price * quantity
 *
 * @author ManhKM on 2/7/2022
 * @project introduction-java-variable-function-main
 */
public class ParentOrder {
    private double totalValue;

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
