package com.tests.designPatterns.gof.creational.abstractFactory.example01;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
