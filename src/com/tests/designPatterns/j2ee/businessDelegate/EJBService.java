package com.tests.designPatterns.j2ee.businessDelegate;

public class EJBService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
	}
}
