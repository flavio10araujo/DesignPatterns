package com.tests.designPatterns.factory.implementationClassRegistration.withReflection;

/**
 * With this approach we can register new product classes to the factory without even changing the factory itself. 
 * For creating objects inside the factory class without knowing the object type we keep a map between the productID and the class type of the product. 
 * In this case when a new product is added to the application it has to be registered to the factory. 
 * This operation doesn't require any change in the factory class code.
 * 
 * This reflection implementation has its own drawbacks. 
 * The main one is performance. 
 * When the reflection is used the performance on code involving reflection can decrease even to 10% of the performance of a non reflection code. 
 * Another issue is that not all the programming languages provide reflection mechanism.
 */
public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// Here we are registering the existing shape forms.
		// Usually, the factory is singleton, so the way of register would be something like: 
		// ShapeFactory.registerShape("NAME", ShapeName.class);
		// We can register in basically two ways:
		// 1 - Registration done outside of shape classes (as we did here).
		// 2 - Registration done inside the shape classes.
		//     In this case, for example, we could put the ShapeFactory.registerShape("CIRCLE", Circle.class) in a static block inside the Circle class. 
		shapeFactory.registerShape("CIRCLE", Circle.class);
		shapeFactory.registerShape("SQUARE", Square.class);
		shapeFactory.registerShape("RECTANGLE", Rectangle.class);
		shapeFactory.registerShape("TRIANGLE", Triangle.class);
		
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();

		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();

		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		
		Shape shape4 = shapeFactory.getShape("TRIANGLE");
		shape4.draw();
	}
}