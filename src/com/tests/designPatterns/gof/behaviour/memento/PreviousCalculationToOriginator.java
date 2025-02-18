package com.tests.designPatterns.gof.behaviour.memento;

/**
 * Memento Interface to Originator
 *
 * This interface allows the originator to restore its state
 */
public interface PreviousCalculationToOriginator {

	public int getFirstNumber();
	public int getSecondNumber();
}
