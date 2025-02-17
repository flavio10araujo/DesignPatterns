package com.tests.designPatterns.gof.structural.facade.example01;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}
}
