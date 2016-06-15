package com.tests.designPatterns.chainOfResponsibility;

public abstract class Handler {
	protected Handler m_successor;
	
	public void setSuccessor(Handler successor) {
		m_successor = successor;
	}

	//public abstract void handleRequest(Request request);
	public void handleRequest(Request request) {
		m_successor.handleRequest(request);
	}
}