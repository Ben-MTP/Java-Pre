package com.msoft.javajob.basic.multi;

/**
 * @author ManhKM on 8/29/2022
 * @project Java-Task
 * -----
 * Để kiểu là kiểu của thằng Cha -> còn new là con
 * Nếu số Task quá lớn thì việc thực hiện đơn luồng là không khả thi.
 * Nó không có chờ nhau, cứ CPU nhàn rỗi thì nó tối ưu để chạy luôn.
 *
 */
public class MyMultiThread {

    public static void main(String[] args) {
        Runnable myTask1 = new MyTask("A", 50);
        Thread thread1 = new Thread(myTask1);

        Runnable myTask2 = new MyTask("B", 50);
        Thread thread2 = new Thread(myTask2);

        thread1.start();    // khi start() thì tự động Thread sẽ kích hoạt --> run() method
        thread2.start();
    }

}
