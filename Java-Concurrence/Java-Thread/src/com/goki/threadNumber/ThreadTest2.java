package com.goki.threadNumber;

/**
 * @author ManhKM on 4/11/2022
 * @project Java-Thread
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();

        ThreadRandom threadRandom = new ThreadRandom(shareData);
        ThreadSquare threadSquare = new ThreadSquare(shareData);

        threadSquare.start();
        threadRandom.start();
    }
}
