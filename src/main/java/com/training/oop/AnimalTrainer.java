package com.training.oop;

public class AnimalTrainer {
    public void train(Animal animal) {
        System.out.println("Train " + animal.getClass().getSimpleName());
    }

}
