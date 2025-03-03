package com.tests.designPatterns.gof.behaviour.state.example01;

public class StopState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	public String toString(){
		return "Stop State";
	}
}
