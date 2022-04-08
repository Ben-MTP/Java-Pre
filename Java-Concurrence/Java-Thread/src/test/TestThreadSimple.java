package test;

import com.manhkm.extendthread.ThreadSimple;

/**
 * Làm việc với Thread -> khi start nó lên
 *                     -> khi stop nó
 * -> get lấy một số thông tin quan trọng.
 * @author ManhKM on 4/5/2022
 * @project Java-Thread
 */
public class TestThreadSimple {
    public static void main(String[] args) {
        ThreadSimple threadSimple = new ThreadSimple();
        threadSimple.start();
        System.out.println("id: "+threadSimple.getId());
    }
}
