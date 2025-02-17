package com.tests.designPatterns.gof.behaviour.command.example01;

//Receiver class.
public class StockTrade {

	public void buy() {
		System.out.println("You want to buy stocks");
	}

	public void sell() {
		System.out.println("You want to sell stocks ");
	}
}
