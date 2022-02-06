package main.practice.unit12.threadexample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 2/6/2022
 * @project introduction-java-variable-function-main
 */
public class JavaSynchronized {
    public static void main(String[] args) throws Exception {

        // Mảng chứa những giá trị kiểu Integer
        List<Integer> ints = new ArrayList<>();

        // Calculation -> chứa các method tính toán -> increase
        Calculation c = new Calculation();

        new Thread(() -> {
            System.out.println("Khởi tạo giá trị trong thread_1");
            try{
                Thread.sleep(1000);
                for (Integer i: new ArrayList<>(ints)) {
                    Thread.sleep(1);
                    System.out.println("Value of thread_1: " + i);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            System.out.println("Khởi tạo giá trị trong thread_2");
            for (int i = 0; i < 100; i++) {
                ints.add(i);
                System.out.println("Add value into list: " + i);
            }
        }).start();

        Thread.sleep(1000);
        System.out.println("Giá trị ban đầu của Calculation: "+c.x);
    }
}

/**
 * Class Calculation
 * + Method increase -> tăng giá lên 1
 */
class Calculation{
    int x;
    public void increase(){
        x++;
    }
}
