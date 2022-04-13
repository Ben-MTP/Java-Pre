package com.goki;

/**
 * Khi này các thread đang chạy một cách lung tung, không theo thứ tự
 * Khả năng nên cần một kiểu đồng bộ luồng trong Java
 * @author ManhKM on 4/11/2022
 * @project Java-Thread
 */
public class MainThread {
    public static void main(String[] args) {

        /**
         * Thread 1:
         * Cách 1: Tạo bằng cách new Từ chính Runnable()
         */
        Thread thread1 = new Thread(new Runnable() {
            private String threadName = "Thread-1";
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    System.out.println(this.threadName + " >>> " + i);
                }
            }
        });
        thread1.start();

        /**
         * Thread 2:
         * Tạo bằng cách Extend từ chính Thread.
         */
        Thread thread2 = new Thread2("Thread-2");
        thread2.start();

        /**
         * Thread 3:
         * Bằng cách triển khai rõ ràng hơn với việc so với cách 1.
         */
        Thread3 r = new Thread3("Thread-3");
        Thread thread3 = new Thread(r);
        thread3.start();

        for (int i = 0; i < 10; i++){
            System.out.println("Thread main >>> " + i);
        }
    }
}
