package com.jindo.core.vd1;

/**
 * @author ManhKM on 5/10/2022
 * @project Banking-synch-unsynch
 */
public class Access implements Runnable{

    String name;
    count c;

    public Access(String name, count c){
        this.name = name;
        this.c = c;
    }

    /**
     * Tại mỗi index sẽ sảy ra 2 trường hợp:
     *  Th1: Giá trị ban đầu là đúng
     *  Th2: Giá trị tiếp theo trong cùng một index đó sẽ trừ đi 1 đơn vị.
     *      Thread-1 index 0 before: 10
     *      Thread-1 index 0 before: 8
     *  Lý do: Trong thời gian in ra giá trị ban đầu và in ra lệnh thì Thread 2 đã thực hiện giảm giá trị của value.
     */
    @Override
    public synchronized void run() {
        for(int i = 0; i < 3; i++){
            System.out.println(name + " index " + i + " before: " + c.value);
            c.value--;
            System.out.println(name + " index " + i + " before: " + c.value);

        }
    }
}
