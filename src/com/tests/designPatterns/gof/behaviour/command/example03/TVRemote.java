package com.tests.designPatterns.gof.behaviour.command.example03;

public class TVRemote {

	public static ElectronicDevice getDevice() {
		return new Television();
	}
}
