package com.tests.designPatterns.facade.example02;

public class AccountNumberCheck {

	private int accountNumber = 12345678;

	public int getAccountNumber() { return accountNumber; }

	public boolean accountActive(int acctNumToCheck) {
		if (acctNumToCheck == getAccountNumber()) {
			return true;	
		}
		else {
			return false;	
		}	
	}	
}