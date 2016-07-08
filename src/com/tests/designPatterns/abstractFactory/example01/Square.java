package com.tests.designPatterns.abstractFactory.example01;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}