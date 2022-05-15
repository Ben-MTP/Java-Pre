package main.practice.unit12.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * Bài toán giả thiết rằng
 * Nếu có 2 thread
 * Một Thread làm nhiệm vụ khởi tạo giá trị cho List
 * Một Thread làm nhiệm vụ duyệt các phần từ của List đó.
 * TH: Có thể gặp lỗi nếu sãy ra case này.
 */
public class JavaListSynchronized {
    private static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {

        /**
         * Thread A
         * Làm nhiệm vụ khởi tạo giá trị cho List.
         * Nếu phần từ khá lớn thì sẽ sinh ra lỗi.
         *      -> Exception in thread
         *      ConcurrentModificationException
         *      JavaListSynchronized
         */
        new Thread(() -> {
            for (int i = 0; i < 10000; i++){
                list.add(i);
            }
        }).start();

        new Thread(() -> {
            for (int i: list) {
                System.out.print(i + ", ");
            }
        }).start();

        Thread.sleep(1000);
        System.out.println(list.size());

    }
}
