package com.o7p.runnable;

/**
 * @author ManhKM on 6/30/2022
 * @project Java-Thread
 */
public class RunnableDemo implements Runnable{

    @Override
    public void run() {
        int idx = 1;
        for (int i = 0; i < 5; i++){
            System.out.println(" - Hello from RunnableDemo: - " + idx + " - " + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(" - RunnableDemo stopped!...");

    }
}
