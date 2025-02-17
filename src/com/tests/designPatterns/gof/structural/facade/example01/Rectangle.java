package com.tests.designPatterns.gof.structural.facade.example01;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
}
