package com.tests.designPatterns.gof.structural.facade.example01;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}
}
