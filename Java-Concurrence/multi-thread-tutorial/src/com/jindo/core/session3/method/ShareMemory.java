package com.jindo.core.session3.method;

/**
 * @author ManhKM on 3/9/2023
 * @project multi-thread-tutorial
 */
public class ShareMemory {

    // Xác định index in ra ngoài màn hình
    volatile int count = 0;

    /**
     * synchronized
     * Cơ chế: Phương thức này sẽ được cấp duy nhất 1 java monitor
     * Chỉ có luồng nào nắm giữ monitor mới có quyền gọi phương thức này
     * @param threadName
     */
    public synchronized void printData(String threadName){
        for (int i = 1; i <= 20; i++){
            count++;
            System.out.println(threadName + ": " + i + "\t - [count]: " + count);
        }
    }
}
