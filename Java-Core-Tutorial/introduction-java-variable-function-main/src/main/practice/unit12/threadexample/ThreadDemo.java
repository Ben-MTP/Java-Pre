package main.practice.unit12.threadexample;

/**
 * @author ManhKM on 2/8/2022
 * @project introduction-java-variable-function-main
 */
public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Thread chạy không đồng bộ: ");
        new Thread1().start();
        new Thread2().start();
        new Thread1().start();
    }
}

class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 200; i++){
            System.out.println("This is Thread_1");
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 200; i++){
            System.out.println("This is Thread_2");
        }
    }
}

