package com.tests.designPatterns.gof.behaviour.command.example01;

//ConcreteCommand Class.
public class BuyStockOrder implements Order {
	private StockTrade stock;

	public BuyStockOrder(StockTrade st) {
		stock = st;
	}

	public void execute() {
		stock.buy();
	}
}
