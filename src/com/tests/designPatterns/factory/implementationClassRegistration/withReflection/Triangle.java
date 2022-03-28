package com.tests.designPatterns.factory.implementationClassRegistration.withReflection;

public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Triangle::draw() method.");
	}
}