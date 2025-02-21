package com.tests.designPatterns.gof.behaviour.strategy.example03;

public class Animal {
	public Flys flyingType;

	public String tryToFly() {
		return flyingType.fly();
	}

	public void setFlyingAbility(Flys newFlyType) {
		flyingType = newFlyType;
	}
}
