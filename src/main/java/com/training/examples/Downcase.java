package com.training.examples;

public class Downcase extends StringProcessor {
	@Override
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}
}