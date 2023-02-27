package com.goki.java2.thread.lession4;

/**
 * @author ManhKM on 7/3/2022
 * @project Java-Thread
 * -----
 * Thực hiện yêu cầu tạo một Thread sinh số ngẫu nhiên > hiển thị ra ngoài màn hình
 * Thực hiện yêu cầu bình phương của số ngẫu nhiên đó lên và hiển thị ra ngoài màn hình
 * Thực hiện khởi chạy 2 luồng này.
 *
 * -----
 * Tại sao khi chạy xong 10 lần mà chương trình vẫn chưa dừng lại, nó đang pending ở đâu
 *
 */
public class Test2 {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        System.out.println("Thực hiện khởi tạo một vùng chia sẻ dữ liệu: " + sharedData);

        ThreadRandom threadRandom = new ThreadRandom(sharedData);
        System.out.println("Thực hiện khởi tạo ThreadRandom: " + threadRandom);

        ThreadSquare threadSquare = new ThreadSquare(sharedData);
        System.out.println("Thực hiện khởi tạo ThreadSquare: " + threadSquare);

        System.out.println("Thực hiện khởi chạy 2 threadRandom và threadSquare: ");
        threadRandom.start();
        threadSquare.start();

    }
}
