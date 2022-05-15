package main.practice.unit5.theory.modifierpackage;


import main.practice.unit5.theory.modifierpackage.sub.Car;

/**
 * @author ManhKM on 1/31/2022
 * @project introduction-java-variable-function-main
 */
public class UsingCar {
    Car car = new Car();
    private void run(){
        System.out.println("Running Car!!!");
        car.setColor("Red");
    }

    public void start(){
        run();
        System.out.println("Color of Car: " + car.getColor());
    }
}
