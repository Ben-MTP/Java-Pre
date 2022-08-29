package com.gpcode.info;

/**
 * ThreadInfoExample:
 *      + QH: Kế thừa
 *      + QH: Đa hình -> Thread -> WorkingThread.
 * Tại sao không call luôn vào run() -> mà phải thông qua start().
 *      + Nó không chỉ là call mà còn phải cấp phát vùng nhớ cho thread + nhiều thứ khác...
 * Phương thức Sleep(mili-second)
 *
 * @author ManhKM on 4/5/2022
 * @project Java-Thread
 */
public class ThreadInfoExample {
    public static void main(String[] args) {
        Thread t1 = new WorkingThread("Luồng 1");
        Thread t2 = new WorkingThread("Luồng 2");
        Thread t3 = new WorkingThread("Luồng 3");

        System.out.println("ID luồng 1: " + t1.getId());
        System.out.println("ID luồng 2: " + t2.getId());
        System.out.println("ID luồng 3: " + t3.getId());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
