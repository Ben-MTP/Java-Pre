package main.practice.unit12.threadexample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 2/6/2022
 * @project introduction-java-variable-function-main
 */
public class JavaSynchronized {
    public static void main(String[] args) throws Exception {

        // Calculation -> chứa các method tính toán -> increase
        Calculation c = new Calculation();

        new Thread(() -> {
            for (int i = 0; i < 100000000; i++) {
                c.increase();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100000000; i++){
                c.increase();
            }
        }).start();

        Thread.sleep(100000);
        System.out.println("Giá trị ban đầu của Calculation: "+c.x);
    }
}

/**
 * Class Calculation
 * + Method increase -> tăng giá lên 1
 */
class Calculation{
    int x;
    public synchronized void increase(){
        x++;
    }
}
