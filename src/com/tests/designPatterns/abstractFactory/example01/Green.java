package com.tests.designPatterns.abstractFactory.example01;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}
}