package com.tests.designPatterns.gof.structural.decorator.example02;

public class Main {

	public static void main(String[] args) {
		// The PlainPizza object is sent to the Mozzarella constructor and then to the TomatoSauce constructor.
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println("Ingredients: " + basicPizza.getDescription());
		System.out.println("Price: " + basicPizza.getCost());
	}
}
