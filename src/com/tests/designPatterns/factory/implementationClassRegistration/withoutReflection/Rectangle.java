package com.tests.designPatterns.factory.implementationClassRegistration.withoutReflection;

public class Rectangle implements Shape {

	static {
		ShapeFactory.getInstance().registerShape("RECTANGLE", new Rectangle());
	}
	
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

	@Override
	public Shape createShape() {
		return new Rectangle();
	}
}