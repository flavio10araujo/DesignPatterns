package com.tests.designPatterns.gof.behaviour.command.example01;

//Client
public class Main {
	public static void main(String[] args) {
		StockTrade stock = new StockTrade();
		BuyStockOrder bsc = new BuyStockOrder(stock);
		SellStockOrder ssc = new SellStockOrder(stock);
		Agent agent = new Agent();

		agent.placeOrder(bsc); // Buy Shares
		agent.placeOrder(ssc); // Sell Shares
	}
}
