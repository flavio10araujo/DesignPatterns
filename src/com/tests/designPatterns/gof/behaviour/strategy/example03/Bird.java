package com.tests.designPatterns.gof.behaviour.strategy.example03;

public class Bird extends Animal {

	public Bird(){
		super();
		flyingType = new ItFlys();
	}
}
