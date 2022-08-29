package com.msoft.javajob.basic.multi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ManhKM on 8/29/2022
 * @project Java-Task
 */
public class ExecutorServiceClient {

    public static void main(String[] args) {

        // Tạo pool với 2 thread cố định:
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // Đặt các Task vào executor:
        executor.execute(new MyTask("a", 10));
        executor.execute(new MyTask("b", 20));
        executor.execute(new MyTask("c", 30));

        // Ngừng executor:
        executor.shutdown();
    }

}
