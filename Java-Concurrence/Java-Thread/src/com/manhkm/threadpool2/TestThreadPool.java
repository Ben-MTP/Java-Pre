package com.manhkm.threadpool2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 3/8/2022
 * @project Java-Thread
 */
public class TestThreadPool {
    public static void main(String[] args) {

        /**
         * số lượng Thread tối thiểu trong ThreadPool
         * Khi khởi tạo, số lượng Thread có thể là 0.
         * Khi nhiệm vụ được thêm vào thì Thread mới được tạo ra và kể từ đây.
         * Nếu số lượng Thread ít hơn corePoolSize thì những Thread mới sẽ được tạo ra đến khi số Thread bằng corePoolSize.
         */
        int corePoolSize = 5;

        /**
         * maximumPoolSize
         * Là số lượng tối đa các Thread trong ThreadPool
         */
        int maximumPoolSize = 10;

        /**
         * Khi số Thread lớn hơn corePoolSize thì keepAliveTime là thời gian tối đa
         * mà một Thread nhàn rỗi -> chờ nhiệm vụ.
         * Khi hết thời gian chờ mà Thread chưa có task thì nó sẽ tự hủy.
         */
        int keepAliveTime = 500;

        /**
         * Đơn vị thời gian của keepAliveTime.
         * Trong ví dụ: TimeUnit.SECONDS
         */
        TimeUnit unit = TimeUnit.SECONDS;

        /**
         * workQueue là hàng đợi dùng để chứa các nhiệm vụ mà các Thread
         * sẽ lấy chúng ra và thực thi khi đến lượt -> ArrayBlockingQueue.
         */
        ArrayBlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(100);

        /**
         * Handle -> hành động khi một request task bị từ chối -> rejected.
         */
        RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,
                maximumPoolSize, keepAliveTime, unit, workQueue, handler);
        int maxLength = 10;
        for (int i = 0; i < maxLength; i++){
            threadPoolExecutor.execute(new Run(i));
        }
    }
}
