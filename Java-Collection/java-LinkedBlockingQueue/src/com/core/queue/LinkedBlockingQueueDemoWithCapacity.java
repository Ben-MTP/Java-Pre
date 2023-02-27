package com.core.queue;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author ManhKM on 11/25/2022
 * @project java-LinkedBlockingQueue
 */
public class LinkedBlockingQueueDemoWithCapacity {

    public static void main(String[] args) {
        int capacity = 15;
        LinkedBlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<>(capacity);

        // Add value:
        for (int i = 0; i < 15; i++){
            linkedBlockingQueue.add(i);
        }

        // print queue:
        System.out.println("LinkedBlockingQueue: " + linkedBlockingQueue);
    }

}
