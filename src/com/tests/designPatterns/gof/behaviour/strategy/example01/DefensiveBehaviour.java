package com.tests.designPatterns.gof.behaviour.strategy.example01;

public class DefensiveBehaviour implements IBehaviour{

	public int moveCommand() {
		System.out.println("\tDefensive Behaviour: if find another robot run from it");
		return -1;
	}
}
