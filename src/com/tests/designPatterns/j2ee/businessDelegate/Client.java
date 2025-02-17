package com.tests.designPatterns.j2ee.businessDelegate;

public class Client {
	BusinessDelegate businessService;

	public Client(BusinessDelegate businessService){
		this.businessService  = businessService;
	}

	public void doTask(){
		businessService.doTask();
	}
}
