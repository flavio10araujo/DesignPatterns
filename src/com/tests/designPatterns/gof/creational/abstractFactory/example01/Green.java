package com.tests.designPatterns.gof.creational.abstractFactory.example01;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}
}
