package com.syndemo;

import java.io.IOException;

/**
 * @author ManhKM on 2/14/2022
 * @project Java-String
 */
public class AppendableRunnable<T extends Appendable> implements Runnable {
    static long time = 0;
    T appendable;

    public AppendableRunnable(T appendable) {
        this.appendable = appendable;
    }

    @Override
    public void run() {
        long time = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            try {
                appendable.append("append string ");
            } catch (IOException e) {
            }
        }
        AppendableRunnable.time += (System.currentTimeMillis() - time);
    }
}
