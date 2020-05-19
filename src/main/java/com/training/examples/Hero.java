package com.training.examples;

import com.training.interfaces.*;

public class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
	public void swim(){};
	public void fly(){};
}