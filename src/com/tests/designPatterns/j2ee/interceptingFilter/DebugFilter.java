package com.tests.designPatterns.j2ee.interceptingFilter;

public class DebugFilter implements Filter {
	public void execute(String request){
		System.out.println("request log: " + request);
	}
}
