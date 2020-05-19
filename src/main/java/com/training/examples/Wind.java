package com.training.examples;
import com.training.interfaces.*;

public class Wind extends Instrument {
	
	public void play(Note n) {
		System.out.println("Wind.play()" + n);
	}
}