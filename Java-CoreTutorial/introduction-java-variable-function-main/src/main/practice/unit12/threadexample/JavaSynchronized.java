package main.practice.unit12.threadexample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ManhKM on 2/6/2022
 * @project introduction-java-variable-function-main
 */
public class JavaSynchronized {
    public static void main(String[] args) throws Exception {

        // Calculation -> chứa các method tính toán -> increase
        Calculation c = new Calculation();

        new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                c.increase();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100000; i++){
                c.increase();
            }
        }).start();

        Thread.sleep(10000);
        System.out.println("Giá trị ban đầu của Calculation: "+c.x);
    }
}

/**
 * Class Calculation
 * + Method increase -> tăng giá lên 1
 * apply: synchronized
 * Result: 167965
 * Cách 1: Dùng với keyword: synchronized
 *
 * Cách 2: Dùng với cơ chế: ReentrantLock().
 *  Kết quả vẫn ngon: 200000.
 */
class Calculation{
    private Lock lock = new ReentrantLock();
    int x;
    public void increase(){
        lock.lock();
        x++;
        lock.unlock();
    }
}
