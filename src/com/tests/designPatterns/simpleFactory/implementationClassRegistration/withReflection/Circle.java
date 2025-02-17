package com.tests.designPatterns.simpleFactory.implementationClassRegistration.withReflection;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
