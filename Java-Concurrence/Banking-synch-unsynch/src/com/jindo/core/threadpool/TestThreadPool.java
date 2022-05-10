package com.jindo.core.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 5/10/2022
 * @project Banking-synch-unsynch
 */
public class TestThreadPool {
    public static void main(String[] args) {
        int corePoolSize = 5;
        int maximumPoolSize = 10;
        long keepAliveTime = 500;
        TimeUnit unit = TimeUnit.SECONDS;

        ArrayBlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(100);
        RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();
        /**
         * Code khởi tạo ThreadPoolExecutor:
         *      + corePoolSize: là số lượng Thread tối thiếu trong ThreadPool.
         *          Khi khởi tạo, số lượng Thread có thể là 0. Khi nhiệm vụ được thêm vào thì Thread mới được tạo ra
         *          kể từ đây, nếu số lượng Thread ít hơn corePoolSize thì những Thread mới sẽ được tạo ra đến khi số
         *          Thread bằng giá trị của corePoolSize.
         *      + maximumPoolSize: là số lượng tối đa các Thread trong ThreadPool
         *      + keepAliveTime: khi số Thread lớn hơn corePoolSize thì keepAliveTime là thời gian tối đa mà một Thread "nhàn rỗi"
         *          chờ nhiệm vụ. Khi hết thời gian chờ mà Thread đó chưa có nhiệm vụ thì Thread đó sẽ bị hủy.
         *      + unit: là đơn vị thời gian của keepAliveTime.
         *          Trong ví dụ này thì unit là TimeUnit.SECONDS.
         *      + workQueue: là hàng đợi dùng để chứa các nhiệm vụ mà các Thread sẽ lấy chúng ra và thực thi lần lượt,
         *          Trong ví dụ này sử dụng: ArrayBlockingQueue.
         *      + handler: Hàng động khi một request (task) bị từ chối (rejected)
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,
                maximumPoolSize, keepAliveTime, unit, workQueue, handler);
        for(int i = 0; i < 100; i++){
            /**
             * Khởi tạo 1 Thread thực hiện logic nào đó.
             */
            threadPoolExecutor.execute(new Run(i));
        }
        threadPoolExecutor.shutdown();
    }
}
