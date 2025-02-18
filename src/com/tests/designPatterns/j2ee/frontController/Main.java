package com.tests.designPatterns.j2ee.frontController;

public class Main {

	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}
}
