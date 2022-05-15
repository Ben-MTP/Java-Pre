package main.practice.unit2;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 */
public class WhileTest {
    public static void main(String[] args) {
        int sumValue = 0;
        int i = 0;
        while (i< 1000){
            // sumValue += i++;
            sumValue += i;
            i++;
        }
        System.out.println("Tổng giá trị: " + sumValue);
    }
}
