package com.jindo.core.session1.thread;

/**
 * @author ManhKM as [ADMIN]
 * @project multi-thread-tutorial on 7/26/2023-11:04 AM (>_<)/
 * @note
 */
public class ActionInThreadDemo {
    public static void main(String[] args) {

        // Khởi tạo một Thread:
        ThreadDemo threadDemo1 = new ThreadDemo("new-thread-01");   // NEW
//        threadDemo1.start();    // RUNNABLE
        threadDemo1.stop();
        threadDemo1.interrupt();
        threadDemo1.resume();
    }
}
