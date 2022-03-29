package com.tests.designPatterns.factory.implementationClassRegistration.withoutReflection;

/**
 * Here we don't want to use reflection but in the same time we want to have a reduced coupling between the factory and concrete products. 
 * Since the factory should be unaware of products we have to move the creation of objects outside of the factory 
 * to an object aware of the concrete products classes. 
 * That would be the concrete class itself.
 * We add a new abstract method in the product abstract class. 
 * Each concrete class will implement this method to create a new object of the same type as itself. 
 * We also have to change the registration method such that we'll register concrete product objects instead of Class objects.
 */
public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = ShapeFactory.getInstance();

		shapeFactory.registerShape("CIRCLE", new Circle());
		shapeFactory.registerShape("SQUARE", new Square());
		shapeFactory.registerShape("RECTANGLE", new Rectangle());
		shapeFactory.registerShape("TRIANGLE", new Triangle());
		
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();

		/*Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();

		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		
		Shape shape4 = shapeFactory.getShape("TRIANGLE");
		shape4.draw();*/
	}
}