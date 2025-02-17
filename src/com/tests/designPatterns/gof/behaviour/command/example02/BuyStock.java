package com.tests.designPatterns.gof.behaviour.command.example02;

public class BuyStock implements Order {
	private Stock abcStock;

	public BuyStock(Stock abcStock){
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.buy();
	}
}
