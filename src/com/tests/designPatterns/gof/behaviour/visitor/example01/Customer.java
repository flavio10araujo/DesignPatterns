package com.tests.designPatterns.gof.behaviour.visitor.example01;

import java.util.ArrayList;
import java.util.Iterator;

public class Customer {

private String name;

	private ArrayList orders = new ArrayList();

	public void accept(IVisitor visitor) {
		visitor.visit(this);

		for (Iterator it=orders.iterator(); it.hasNext();) {
			((IVisitable)it.next()).accept(visitor);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public Customer(String name) {
		this.name = name;
	}
}
