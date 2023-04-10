package com.jindo.core.session5;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @author ManhKM on 3/10/2023
 * @project multi-thread-tutorial
 */
public class CallableWorker implements Callable<Integer> {

    private int num;    // Truyền vào 1 số cần tính
    private Random ran; // Số bất kỳ để sleep

    public CallableWorker(int num){
        this.num = num;
        this.ran = new Random();
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(ran.nextInt(10));
        int result = num * num;
        System.out.println("Complete " + num);
        return result;
    }
}
