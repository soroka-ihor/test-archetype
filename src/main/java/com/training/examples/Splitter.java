package com.training.examples;
import java.util.*;

public class Splitter extends StringProcessor {
	@Override
	public String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
}