package com.tests.designPatterns.gof.behaviour.state.example01;

public class Context {
	private State state;

	public Context(){
		state = null;
	}

	public void setState(State state){
		this.state = state;
	}

	public State getState(){
		return state;
	}
}
