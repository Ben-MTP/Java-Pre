package main.practice.unit2;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 */
public class ForTest {
    public static void main(String[] args) {
        int sumValue = 0;
        for(int i = 0; i < 1000; i++){
            sumValue += i;
            //sumValue = sumValue + i;
        }
        System.out.println("Tổng giá trị từ 0 đến 1000: " + sumValue);
    }
}
