package com.tests.designPatterns.j2ee.businessDelegate;

public class BusinessLookUp {

	public BusinessService getBusinessService(String serviceType){
		if(serviceType.equalsIgnoreCase("EJB")){
			return new EJBService();
		}
		else {
			return new JMSService();
		}
	}
}
