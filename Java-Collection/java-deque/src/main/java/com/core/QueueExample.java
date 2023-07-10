package com.core;

import java.util.ArrayDeque;

/**
 * Lưu ý rằng: ArrayQueue không phải là một thread-safe.
 * Nếu sử dụng trong môi trường đa luồng, hãy đảm bảo rằng đã đồng bộ hóa truy cập đến nó.
 */
public class QueueExample {
    public static void main(String[] args) {
        ArrayDeque<Object> queue = new ArrayDeque<>();

        // Thêm phần từ vào hàng đợi:
        queue.addLast("First");
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        queue.addLast(3.14);
        queue.addLast("The End");

        // Lấy và in ra phần từ đầu hàng đợi:
        System.out.println("First element: " + queue.getFirst());

        // Xóa phần từ đầu hàng đợi:
        System.out.println("Delete success first element: " + queue.removeFirst());

        // IN ra số lượng phần tử trong hàng đợi:
        System.out.println("Size of queue: " + queue.size());

        // In ra số lượng các phần từ còn lại:
        System.out.println("List data of queue: ");
        for (Object element : queue){
            System.out.print(element + ", ");
        }
    }
}
