package com.training.oop;

public class Manul extends Cat {
    public int weight = 2;

    @Override
    public void eat() {
        System.out.println("Manul eat.");
    }

    @Override
    public void sleep() {
        System.out.println("Manul sleep.");
    }


}
