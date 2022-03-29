package com.tests.designPatterns.factory.implementationClassRegistration.withoutReflection;

public class Square implements Shape {

	static {
		ShapeFactory.getInstance().registerShape("SQUARE", new Square());
	}
	
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

	@Override
	public Shape createShape() {
		return new Square();
	}
}