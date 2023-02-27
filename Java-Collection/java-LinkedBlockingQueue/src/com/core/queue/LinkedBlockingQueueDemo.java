package com.core.queue;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author ManhKM on 11/25/2022
 * @project java-LinkedBlockingQueue
 */
public class LinkedBlockingQueueDemo {

    public static void main(String[] args) {

        LinkedBlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<>();
        linkedBlockingQueue.add(1);
        linkedBlockingQueue.add(2);
        linkedBlockingQueue.add(3);
        linkedBlockingQueue.add(4);
        linkedBlockingQueue.add(5);

        System.out.println("LinkedBlockingQueue: " + linkedBlockingQueue);
    }
}
