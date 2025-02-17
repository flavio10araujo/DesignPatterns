package com.tests.designPatterns.gof.behaviour.command.example01;

import java.util.ArrayList;
import java.util.List;

//Invoker.
public class Agent {

	//private m_ordersQueue = new ArrayList();
	private List<Order> m_ordersQueue = new ArrayList<Order>();

	public Agent() {
	}

	void placeOrder(Order order) {
		//ordersQueue.addLast(order);
		//order.execute(ordersQueue.getFirstAndRemove());

		m_ordersQueue.add(order);
		order.execute();
	}
}
