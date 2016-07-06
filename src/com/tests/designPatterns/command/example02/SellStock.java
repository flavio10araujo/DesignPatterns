package com.tests.designPatterns.command.example02;

public class SellStock implements Order {
	private Stock abcStock;

	public SellStock(Stock abcStock){
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}
}