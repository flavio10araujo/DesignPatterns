package com.tests.designPatterns.gof.creational.abstractFactory.example01;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
