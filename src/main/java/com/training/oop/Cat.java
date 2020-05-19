package com.training.oop;
import com.training.oop.*;
import java.io.*;

public class Cat extends Animal {
	public int weight = 1;

	@Override
	public void eat() {
		System.out.println("Cat eat.");
	}

	@Override
	public void sleep() {
		System.out.println("Cat sleep.");
	}
}