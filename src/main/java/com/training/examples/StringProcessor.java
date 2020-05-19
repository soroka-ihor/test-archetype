package com.training.examples;
import com.training.interfaces.*;

public abstract class StringProcessor implements Processor {

	public String name() {
		return getClass().getSimpleName();
	}
	public abstract String process(Object input);

	public static final String s = "If she weights as a duck, she's made of wood";

	public static void main(String[] args) {
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(), s);
	}
}