package com.jindo.core.session1.join;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class UsingJoinMethod extends Thread{

    UsingJoinMethod(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("RUNNING " + getName());
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        UsingJoinMethod thread1 = new UsingJoinMethod("Thread-01");
        UsingJoinMethod thread2 = new UsingJoinMethod("Thread-02");

        thread1.start();
        thread1.join();
        thread2.start();
        System.out.println("Main Thread Finished");
    }
}
