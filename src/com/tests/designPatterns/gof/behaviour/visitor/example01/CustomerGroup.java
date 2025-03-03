package com.tests.designPatterns.gof.behaviour.visitor.example01;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomerGroup {

	//private ArrayList customers = new ArrayList();
	private ArrayList customers = new ArrayList();

	public void accept(IVisitor visitor) {
		for (Iterator it=customers.iterator(); it.hasNext();) {
			((Customer)it.next()).accept(visitor);
		}
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
}
