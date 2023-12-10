package com.manuoku.tij.ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.breathe();
        dog.breathe();
        System.out.println();

        cat.sound();
        dog.sound();
        System.out.println();

        animalSound(new Cat());
        animalSound(new Dog());
    }

    public static void animalSound(Animal animal) {
        animal.sound(); // 재정의된 메소드 호출
    }
}
