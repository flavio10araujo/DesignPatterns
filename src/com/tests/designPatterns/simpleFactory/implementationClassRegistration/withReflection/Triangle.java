package com.tests.designPatterns.simpleFactory.implementationClassRegistration.withReflection;

public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Triangle::draw() method.");
	}
}
