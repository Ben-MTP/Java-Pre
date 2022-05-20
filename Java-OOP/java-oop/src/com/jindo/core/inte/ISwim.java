package com.jindo.core.inte;

/**
 * @author ManhKM on 5/16/2022
 * @project java-oop
 * -----
 * Có con vật thì có thể bơi
 * Hoặc có cả con vật có thể kết hợp nhiều cái với nhau
 */
public interface ISwim extends IAct {
    @Override
    void running(String style);
}
