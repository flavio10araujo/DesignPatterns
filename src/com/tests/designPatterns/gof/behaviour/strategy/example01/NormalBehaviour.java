package com.tests.designPatterns.gof.behaviour.strategy.example01;

public class NormalBehaviour implements IBehaviour {

	public int moveCommand() {
		System.out.println("\tNormal Behaviour: if find another robot ignore it");
		return 0;
	}
}
