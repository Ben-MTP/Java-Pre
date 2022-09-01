package com.jindo.core.generic;

/**
 * @author ManhKM on 9/1/2022
 * @project java-oop
 */
public class PhanSo {
    private int t, m;

    public PhanSo(int t, int m){
        this.t = t;
        this.m = m;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "PhanSo{" +
            "t=" + t +
            ", m=" + m +
            '}';
    }
}
