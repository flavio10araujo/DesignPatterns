package com.tests.designPatterns.command.example01;

//ConcreteCommand Class.
public class SellStockOrder implements Order { 
	private StockTrade stock;
	
	public SellStockOrder(StockTrade st) {
		stock = st;
	}
	
	public void execute() {
		stock.sell();
	}
}