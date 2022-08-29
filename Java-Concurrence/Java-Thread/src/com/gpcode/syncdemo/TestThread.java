package com.gpcode.syncdemo;

/**
 * @author ManhKM on 3/8/2022
 * @project Java-Thread
 * Tham khảo: https://codelearn.io/sharing/dong-bo-va-bat-dong-bo-trong-java
 */
public class TestThread {
    public static void main(String[] args) {
        Count c = new Count();

        // tạo 2 thread try cập vào cùng tài nguyên trong một đối tượng.
        Thread t1 = new Thread(new Access("Thread 1", c));
        Thread t2 = new Thread(new Access("Thread 2", c));
        t1.start();
        t2.start();
    }
}
