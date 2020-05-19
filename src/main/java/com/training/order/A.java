package com.training.order;

public class A {
    private D d = new D("D from A");
    private static D d1 = new D("Static D from A");

    {
        System.out.println("4");
    }

    static {
        System.out.println("1");
    }

    public A() {
        System.out.println("5");
    }

    A getType() {
        return this;
    }
}
