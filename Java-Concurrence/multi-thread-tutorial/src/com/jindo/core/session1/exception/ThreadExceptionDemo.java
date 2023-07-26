package com.jindo.core.session1.exception;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class ThreadExceptionDemo {

    public static void main(String[] args) {
        System.out.println("Main Thread Running...");

        Thread thread = new Thread(new WorkingThread());

        thread.setDaemon(false);

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("#Thread: " + t);
                System.out.println("#Thread exception message" + e.getMessage());
            }
        });

        thread.start();
        System.out.println("Main Thread End!!!");
    }
}
