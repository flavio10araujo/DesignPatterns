package com.tests.designPatterns.j2ee.compositeEntity;

public class Main {

	public static void main(String[] args) {
		Client client = new Client();
		client.setData("Test", "Data");
		client.printData();
		client.setData("Second Test", "Data1");
		client.printData();
	}
}
