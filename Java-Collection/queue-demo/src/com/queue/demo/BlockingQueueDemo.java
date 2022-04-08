package com.queue.demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author ManhKM on 3/8/2022
 * @project Java-Collection
 */
public class BlockingQueueDemo {
    public static void main(String[] args) {

        // ArrayBlockingQueue
        BlockingQueue<String> animal1 = new ArrayBlockingQueue<>(10);

        // LinkedBlockingQueue
        BlockingQueue<String> animal2 = new LinkedBlockingQueue<>();


        // add() -> chèn một phần tử vao BlockingQueue ở cuối queue
        // FIFO
        animal1.add("Chó");
        animal1.add("Mèo");
        animal1.add("Gà");
        animal1.add("Heo");

        // element() -> trả về phần từ ở đầu của Queue.
        System.out.println(animal1.element());

        // remove() -> loại bỏ một phần tử khỏi BlockingQueue
        animal1.remove();
        System.out.println("After remove: " + animal1);

        // offer() -> chèn phần từ được chỉ địn vào BlockingQueue ở cuối
        animal1.offer("Dragon");
        System.out.println("After Offer: " + animal1);

        // peek() -> trả về phần từ đầu của BlockingQuee
        System.out.println("method peek(): " + animal1.peek());

        // poll() -> loại bỏ một phần tử khỏi BlockingQueue:
        animal1.poll();
        System.out.println("After poll(): " + animal1);

        // offer() - poll()
        // Chèn theo khoảng thời gian

        //put()
        //take()

    }
}
