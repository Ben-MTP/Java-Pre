package com.gpcode.join;

/**
 * Cách sử dụng của join:
 *      + để thông báo rằng chờ thread này hoàn thành
 *      rồi thread cha mới được tiếp tục chạy
 * @author ManhKM on 4/5/2022
 * @project Java-Thread
 */
public class UsingJoinMethod extends Thread{

    public UsingJoinMethod(String name){
        super(name);
    }

    /**
     * Thực hiện lặp thông tin trong một Thread
     */
    @Override
    public void run() {
        System.out.println(getName());
        for (int i = 0; i < 10; i++){
            try {
                System.out.print(i + " ");
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        UsingJoinMethod t1 = new UsingJoinMethod("Thread 1");
        UsingJoinMethod t2 = new UsingJoinMethod("Thread 2");

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        System.out.println("-----> Main Thread Finished");
    }

}
