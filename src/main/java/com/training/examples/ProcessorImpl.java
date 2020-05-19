package com.training.examples;
import com.training.interfaces.*;

public class ProcessorImpl implements Processor {
	public ProcessorImpl() {}
	public String name() {
		return getClass().getSimpleName();
	}

	public Object process(Object input) {
		return input;
	}
}