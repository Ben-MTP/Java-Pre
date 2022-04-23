package com.core.thread.loda;

/**
 * @author ManhKM on 4/23/2022
 * @project Java-Thread-Pool
 */
public class MainRequestHandler {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RequestHandler("request-handler"));
        t1.start();
    }
}
