package com.jindo.core.zoo;

import com.jindo.core.encapsulation.Animal;
import com.jindo.core.inheritance.Cat;
import com.jindo.core.inheritance.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 5/16/2022
 * @project java-oop
 */
public class ManageAnimal {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Mèo mướp", "2kg", "10cm", "Màu tam thể"));
        animalList.add(new Cat("Mèo Ai Cập", "2kg", "10cm", "Không có lông"));
        animalList.add(new Dog("Chó mực", "15kg", "30cm"));

        for (Animal item: animalList) {
            System.out.println(item);

            item.running("chạy");
        }
    }
}
