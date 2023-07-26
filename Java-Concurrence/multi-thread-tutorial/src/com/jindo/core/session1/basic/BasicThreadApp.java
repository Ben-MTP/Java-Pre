package com.jindo.core.session1.basic;

/**
 * @author ManhKM as [ADMIN]
 * @project multi-thread-tutorial on 7/26/2023-11:12 AM (>_<)/
 * @note
 */
public class BasicThreadApp {
    public static void main(String[] args) {

        BasicThread basicThreadA = new BasicThread("thread-a");
        BasicThread basicThreadB = new BasicThread("thread-b");
        BasicThread basicThreadC = new BasicThread("thread-c");
        BasicThread basicThreadD = new BasicThread("thread-d");

        basicThreadA.start();
        basicThreadB.start();

    }
}
