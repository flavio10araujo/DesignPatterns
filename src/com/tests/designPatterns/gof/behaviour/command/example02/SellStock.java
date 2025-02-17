package com.tests.designPatterns.gof.behaviour.command.example02;

public class SellStock implements Order {
	private Stock abcStock;

	public SellStock(Stock abcStock){
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}
}
