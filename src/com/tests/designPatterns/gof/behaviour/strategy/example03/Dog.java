package com.tests.designPatterns.gof.behaviour.strategy.example03;

public class Dog extends Animal {

	public Dog() {
		super();
		flyingType = new CantFly();
	}
}
