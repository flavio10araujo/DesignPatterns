package com.tests.designPatterns.gof.creational.abstractFactory.example01;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}
}
