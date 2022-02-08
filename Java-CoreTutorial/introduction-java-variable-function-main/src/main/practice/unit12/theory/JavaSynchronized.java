package main.practice.unit12.theory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * TH1: Nếu dụng HashMap() -> không đảm bảo được việc làm việc với Concurrency
 *      Trường hợp làm việc với đa luồng sẽ không đúng, đủ giá trị.
 * TH2: Để giải quyết bài toán đó -> có một cách xử lý ->
 *      ConcurrentHashMap<>
 *      Lúc này chương trình sẽ vẫn chạy đủ với yêu cầu của logic.
 */
public class JavaSynchronized {
    private static Map<Integer, Integer> map = new ConcurrentHashMap<>();
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 10000; i++){
                map.put(i, i);
            }
        }).start();
        new Thread(() -> {
            for (int i = 10000; i < 20000; i++){
                map.put(i, i);
            }
        }).start();

        Thread.sleep(1000);
        System.out.println("Tổng giá tị của map: " + map.size());
    }
}
