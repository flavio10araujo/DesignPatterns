package com.tests.designPatterns.gof.behaviour.strategy.example03;

public interface Flys {
	String fly();
}

class ItFlys implements Flys {
	public String fly() {
		return "Flying High";
	}
}

class CantFly implements Flys {
	public String fly() {
		return "I can't fly";
	}
}
