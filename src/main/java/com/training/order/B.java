package com.training.order;

public class B extends A {
    private D d = new D("D from B");

    {
        System.out.println("6");
    }

    static {
        System.out.println("2");
    }

    public B () {
        System.out.println("7");
    }

    B getType() {
        return this;
    }
}
