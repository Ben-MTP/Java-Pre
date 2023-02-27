package com.goki.java2.thread.lession4;

/**
 * @author ManhKM on 7/3/2022
 * @project Java-Thread
 * -----
 * Thực hiện việc lưu trữ dữ liệu chia sẻ giữa các luồng trong chương trình.
 */
public class SharedData {
    int rad;

    public SharedData(){}

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }
}
