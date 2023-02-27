package com.o7p;

/**
 * @author ManhKM on 6/30/2022
 * @project Java-Thread
 */
public class HelloMain {
    public static void main(String[] args) {
        int idx = 1;

        for (int i = 0; i < 2; i++){
            System.out.println("Main thread running " + idx++);
            try {
                Thread.sleep(2101);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        HelloThread helloThread = new HelloThread();

        helloThread.start();

        for (int i = 0; i < 3; i++){
            System.out.println("Main thread running " + idx++);
            try {
                Thread.sleep(2101);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(" ---> Main Thread stopped!");
    }
}
