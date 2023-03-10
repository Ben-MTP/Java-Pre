package com.jindo.core.session3.summary;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class SynchronizationExample {

    private static SynchronizationExample instance;

    public synchronized void lockedByThis() {
        System.out
                .println("This synchronized method is locked by current instance of Object. This");
    }

    public static synchronized SynchronizationExample lockedByClassLock() {
        System.out.println(
                "This static synchronized method is locked by class level lock of this class");
        if (instance == null) {
            instance = new SynchronizationExample();
        }
        return instance;
    }

    public static synchronized SynchronizationExample lockedBySynchronizedBlock() {
        System.out.println("This line is executed without locking");
        if (instance == null) {
            synchronized (instance) { // synchronized (SynchronizationExample.class)
                // Thread Safe. Might be costly operation in some case
                if (instance == null) {
                    instance = new SynchronizationExample();
                }
            }
        }
        return instance;
    }

}
