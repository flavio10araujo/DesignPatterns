package com.tests.designPatterns.gof.behaviour.memento;

/**
 * Memento Interface to Originator
 * <p>
 * This interface allows the originator to restore its state
 */
public interface PreviousCalculationToOriginator {
	int getFirstNumber();
	int getSecondNumber();
}
