package com.tests.designPatterns.abstractFactory.example01;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
}