package com.tests.designPatterns.gof.creational.singleton.traditional;

public class Main {
	public static void main(String[] args) {

		//illegal construct
		//Compile Time Error: The constructor SingleObject() is not visible
		//SingleObject object = new SingleObject();

		//Get the only object available
		Singleton object = Singleton.getInstance();

		//show the message
		object.showMessage();
	}
}
