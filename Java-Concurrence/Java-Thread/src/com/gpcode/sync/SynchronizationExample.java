package com.gpcode.sync;

/**
 * @author ManhKM on 4/8/2022
 * @project Java-Thread
 */
public class SynchronizationExample {
    private static SynchronizationExample instance;

    /**
     * Synchronized Method: None-static method
     */
    public synchronized void lockedByThis(){
        System.out.println(" This synchronized method is locked by current, " +
                "instance of object, i.e..this");
    }

    public static synchronized SynchronizationExample lockedByClassLock(){
        System.out.println("This static synchronized method is locked by class level lock");
        if(instance == null){
            instance = new SynchronizationExample();
        }
        return instance;
    }

    public static synchronized SynchronizationExample lockedBySynchronizedBlock(){
        System.out.println("This line is executed without locking");
        if (instance == null){
            synchronized (instance){
                if(instance == null){
                    instance = new SynchronizationExample();
                }
            }
        }
        return instance;
    }
}
