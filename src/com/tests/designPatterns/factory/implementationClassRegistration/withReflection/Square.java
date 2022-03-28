package com.tests.designPatterns.factory.implementationClassRegistration.withReflection;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}