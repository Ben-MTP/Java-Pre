package com.core.queue;

import com.core.queue.entity.Employee;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author ManhKM on 11/25/2022
 * @project java-LinkedBlockingQueue
 */
public class LinkedBlockingQueueObject {

  public static void main(String[] args) {

    int capacity = 100;

    LinkedBlockingQueue<Employee> linkedBlockingQueue
        = new LinkedBlockingQueue<>(capacity);

    for (int i = 0; i < capacity; i++){
      Employee employee = new Employee(i, "Name-" + i, "Address-" + i, i);
      linkedBlockingQueue.add(employee);
    }

    System.out.println(linkedBlockingQueue);
  }
}
