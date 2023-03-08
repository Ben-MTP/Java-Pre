package com.jindo.core.session1.joinlong;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class UsingJoinLongMethod extends Thread {


    UsingJoinLongMethod(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("RUNNING " + getName());
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.print(i + "[" + getId() + "]" + " ");
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread Running");

        UsingJoinLongMethod thread1 = new UsingJoinLongMethod("Thread-01");
        UsingJoinLongMethod thread2 = new UsingJoinLongMethod("Thread-02");
        UsingJoinLongMethod thread3 = new UsingJoinLongMethod("Thread-03");
        UsingJoinLongMethod thread4 = new UsingJoinLongMethod("Thread-04");

        thread1.start();

        /**
         * Main Thread phải chờ 450ms mới được chạy tiếp
         * Không nhất thiết phải chờ Thread1 kết thúc
         */
        thread1.join(450);

        thread2.start();

        thread2.join(450);

        thread3.start();

        thread3.join(450);

        thread4.start();

        thread4.join(450);

        System.out.println("Main Thread Finished");


    }
}
