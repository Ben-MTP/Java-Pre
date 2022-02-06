package main.practice.unit5.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 1/31/2022
 * @project introduction-java-variable-function-main
 *
 * Tính chất minh họa cho việc Đa hình
 * TH1: Nếu khởi tạo một List Car -> có thể add Car hoặc các class kế thừa từ Car
 * TH2: Nếu khởi tạo một List ElectricCar -> thì có thể add được nó hoặc lớp con của nó.
 *      + Nếu add lớp cha của nó thì phải Casting nó về lớp con.
 *
 */
public class CarMain {
    public static void main(String[] args) {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car());
        listCar.add(new Car());
        listCar.add(new Car());
        listCar.add(new Car());
        listCar.add(new ElectricCar());

        for (Car car: listCar){
            car.run();
        }
    }
}
