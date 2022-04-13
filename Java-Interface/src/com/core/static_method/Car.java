package com.core.static_method;

/**
 * @author ManhKM on 4/12/2022
 * @project Java-Interface
 */
public class Car implements Vehicle{
    @Override
    public void showLog() {
        print();
        Vehicle.isValid();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.showLog();
    }
}
