package com.gpcode.ImplementRunable;

/**
 * @author ManhKM on 4/5/2022
 * @project Java-Thread
 */
public class TestRunnableSimple {
    public static void main(String[] args) {

        // Khởi tạo đối tượng RunnableSimple:
        RunnableSimple runnableSimple = new RunnableSimple();

        // Khởi tạo thread:
        Thread t1 = new Thread(runnableSimple);
        t1.start();
    }
}
