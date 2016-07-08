package com.tests.designPatterns.command.example03;

public class TVRemote {
	
	public static ElectronicDevice getDevice() {
		return new Television();	
	}	
}