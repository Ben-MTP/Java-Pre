package com.core.queue;

import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author ManhKM on 11/25/2022
 * @project java-LinkedBlockingQueue
 * -----
 * LinkedBlockingQueueCollection
 */
public class LinkedBlockingQueueCollection {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);
        vector.addElement(5);
        vector.addElement(6);

        LinkedBlockingQueue<Integer> linkedBlockingQueue
            = new LinkedBlockingQueue<>(vector);

        System.out.println("LinkedBlockingQueue: " + linkedBlockingQueue);
    }
}
