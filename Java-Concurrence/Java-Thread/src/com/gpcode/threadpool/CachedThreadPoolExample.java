package com.gpcode.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Tạo ra ThreadPool có kích thước cố định là 2.
 * Sau đó tạo 5 task vào ThreadPool.
 * Vì kích thước ThreadPool là 2 -> nên nó sẽ bắt đầu thực thi với 5 task.
 * và các task khác sẽ ở trạng thái waiting, ngay khi một task hoàn thành,
 * một task khác từ hàng đợi sẽ được chọn và thực thi...
 *      + Runnable
 *      + initialDeplay
 *      + delay()...
 *      + TimeUnit()...
 *      + awaitTermination()...
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class CachedThreadPoolExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();

        for(int i = 1; i <= 10; i++){
            Runnable worker = new WorkerThread(""+i);
            executor.execute(worker);
            Thread.sleep(400);
        }

        executor.shutdown();
        while (!executor.isTerminated()){
            // Running...
        }
        System.out.println("Finished all threads");
    }
}
