package main.practice.unit2.exam;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 * Cho 2 số a, N là 2 số nguyên dương, N > a
 * In ra số dương nhỏ hơn N và chia hết cho a
 */
public class Unit4 {
    public static void main(String[] args) {
        int a = 6;
        int N = 20;
        lookup(a, N);
    }

    private static void lookup(int a, int N) {
        if(a > N){
            System.out.println("Vi phạm điều kiện N > a");
        } else{
            int i = 1;
            System.out.println("Danh sách những số thỏa mãn: ");
            while (i < N){
                if(i % a == 0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
