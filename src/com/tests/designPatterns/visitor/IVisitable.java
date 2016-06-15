package com.tests.designPatterns.visitor;

public interface IVisitable {

	public void accept(IVisitor visitor);
}