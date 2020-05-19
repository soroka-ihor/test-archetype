package com.training.generic;

public class Box<T extends String> {

    private T t;          

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <H extends Integer> void inspect(H c) {
    	System.out.println(c.getClass().getSimpleName());
    	System.out.println(get().getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<String>();
        stringBox.set("a string");
        stringBox.inspect(148);
    }
}