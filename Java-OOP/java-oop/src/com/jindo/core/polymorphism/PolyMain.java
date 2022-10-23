package com.jindo.core.polymorphism;

/**
 * @author ManhKM on 10/23/2022
 * @project java-oop
 */
public class PolyMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        Animal dog = new Dog();
        Animal bird = new Bird();
        Animal fish = new Fish();

        trainer.teach(dog);
        trainer.teach(bird);
        trainer.teach(fish);
    }
}
