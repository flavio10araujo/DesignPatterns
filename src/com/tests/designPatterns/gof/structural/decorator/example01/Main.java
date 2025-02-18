package com.tests.designPatterns.gof.structural.decorator.example01;

public class Main {
	public static void main(String[] args) {

		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());

		circle.draw();
		System.out.println();

		redCircle.draw();
		System.out.println();

		redRectangle.draw();
	}
}
