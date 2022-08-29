package com.msoft.javajob.basic.nonthread;

/**
 * @author ManhKM on 8/29/2022
 * @project Java-Task
 */
public class MyClient {

    public static void main(String[] args) {
        MyTask task1 = new MyTask("A", 20);
        MyTask task2 = new MyTask("B", 20);

        task1.run();
        task2.run();
        task1.run();

    }
}
