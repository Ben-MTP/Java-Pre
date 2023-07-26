package com.jindo.core.session1.thread;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 * @note: Tạo một Thread cơ bản từ việc kế thừa Thread
 */
public class ThreadDemo extends Thread {

    private Thread t;
    private String threadName;

    /**
     * Vừa setting tên và thực hiện gán cho nó một Thread
     * @param t
     * @param name
     */
    ThreadDemo(Thread t, String name){
        this.t = t;
        this.threadName = name;
        System.out.println("Creating " + threadName + ", Thread " + t.getName());
    }

    /**
     * Constructor thực hiện khởi tọa đối tượng ThreadDemo
     * và setting giá trị name cho nó
     * @param name
     */
    ThreadDemo(String name) {
        this.threadName = name;
        System.out.println("Creating " + threadName);
    }

    /**
     * Nơi định nghĩa các kịch bản chạy của Thread này
     * Thực hiện chạy thread với N lần quy định, mỗi lần chạy nghỉ M giây
     */
    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("Thread " + threadName + ", " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread: " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting...");
    }

    /**
     * Hàm bắt đầu custom của chương trình
     * Client sẽ gọi hàm này -> nó sẽ gọi hàm start của thread
     * Từ đó cấp phát tài nguyên và bắt đầu -> run() của thread
     */
    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);   // Not this.threadName
            t.start();
        }
    }
}
