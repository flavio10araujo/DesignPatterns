package com.tests.designPatterns.factory.implementationClassRegistration.withoutReflection;

public class Circle implements Shape {

	static {
		ShapeFactory.getInstance().registerShape("CIRCLE", new Circle());
	}
	
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

	@Override
	public Shape createShape() {
		return new Circle();
	}
}