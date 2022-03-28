package com.tests.designPatterns.factory.implementationClassRegistration.withReflection;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}