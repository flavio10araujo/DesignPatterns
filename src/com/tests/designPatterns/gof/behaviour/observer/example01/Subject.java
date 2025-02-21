package com.tests.designPatterns.gof.behaviour.observer.example01;

//This interface handles adding, deleting and updating all observers.
public interface Subject {

	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
}
