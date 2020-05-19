package com.training.interfaces;

public interface Filter {
	String name();
	Object process(Object input);
}