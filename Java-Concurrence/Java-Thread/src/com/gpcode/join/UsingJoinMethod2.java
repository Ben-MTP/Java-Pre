package com.gpcode.join;

/**
 * @author ManhKM on 4/5/2022
 * @project Java-Thread
 */
public class UsingJoinMethod2 extends Thread{
    public UsingJoinMethod2(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName());
        for (int i = 0; i < 5; i++){
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
        UsingJoinMethod2 t1 = null;
        UsingJoinMethod2 t2 = null;

        try {
            t1 = new UsingJoinMethod2("Thread 1");
            t2 = new UsingJoinMethod2("Thread 2");
            t1.start();
            t1.join(450);

            t2.start();
            System.out.println("Main Thread Finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
