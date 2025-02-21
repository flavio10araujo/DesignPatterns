package com.tests.designPatterns.gof.behaviour.visitor.example01;

public class Item {

private String name;

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	public Item(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
