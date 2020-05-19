package com.training.oop;

public class C extends B {

    static {
        System.out.println("Static field #1 of C");
    }
    public C() {
        System.out.println("Constructor of C");
    }

    static {
        System.out.println("Static field  #2 of C");
    }
    {
        System.out.println("an empty field of C");
    }
}
