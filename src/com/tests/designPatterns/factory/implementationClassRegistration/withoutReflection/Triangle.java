package com.tests.designPatterns.factory.implementationClassRegistration.withoutReflection;

public class Triangle implements Shape {

	static {
		ShapeFactory.getInstance().registerShape("TRIANGLE", new Triangle());
	}
	
	@Override
	public void draw() {
		System.out.println("Inside Triangle::draw() method.");
	}

	@Override
	public Shape createShape() {
		return new Triangle();
	}
}