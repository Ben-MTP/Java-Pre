package com.core;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author ManhKM on 7/21/2022
 * @project java-queue
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> namesQueue    = new LinkedList<>();
        Deque<Integer> numbersDeque = new ArrayDeque<>();
        BlockingQueue<String> waitingCustomers = new ArrayBlockingQueue<>(100);
        Queue<Integer> queueNumbers      = new ArrayBlockingQueue<>(3);
        Deque<String> queueNamesCustomer = new ArrayDeque<>();

        List<String> listNames = Arrays.asList("Alice", "Bob", "Cole", "Dale");
        Queue<String> queueNames = new LinkedList<>(listNames);
        System.out.println("Step 1: " + queueNames);

        queueNames.add("Marry");
        queueNames.add("John");
        queueNames.add("Bob");
        System.out.println("Step 2: " + queueNames);

        System.out.println("-----Queue Name Customers-----");
        queueNamesCustomer.offer("Katherine");
        queueNamesCustomer.offer("Bob");
        queueNamesCustomer.addFirst("Jim");
        queueNamesCustomer.addLast("Tom");
        System.out.println(queueNamesCustomer);

    }
}
