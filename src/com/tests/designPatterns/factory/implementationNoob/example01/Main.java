package com.tests.designPatterns.factory.implementationNoob.example01;

/**
 * This implementation is the most simple and intuitive (let's call it the noob implementation).
 * The problem here is that once we add a new concrete shape call we should modify the ShapeFactory class. 
 * It is not very flexible and it violates open-closed principle. 
 * Of course we can subclass the factory class, but let's not forget that the factory class is usually used as a singleton. 
 * Subclassing it means replacing all the factory class references everywhere through the code.
 */
public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		//get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		//call draw method of Circle
		shape1.draw();

		//get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		//call draw method of Rectangle
		shape2.draw();

		//get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.getShape("SQUARE");

		//call draw method of circle
		shape3.draw();
	}
}