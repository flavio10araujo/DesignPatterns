package com.tests.designPatterns.simpleFactory.implementationClassRegistration.withReflection;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
