package com.tests.designPatterns.interceptingFilter;

public class AuthenticationFilter implements Filter {
	public void execute(String request){
		System.out.println("Authenticating request: " + request);
	}
}