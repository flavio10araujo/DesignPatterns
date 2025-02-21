package com.tests.designPatterns.gof.behaviour.memento;

/**
 * Originator Interface
 */
public interface Calculator {
	// Create Memento
	PreviousCalculationToCareTaker backupLastCalculation();

	// setMemento
	void restorePreviousCalculation(PreviousCalculationToCareTaker memento);

	// Actual Services Provided by the originator
	int getCalculationResult();
	void setFirstNumber(int firstNumber);
	void setSecondNumber(int secondNumber);
}
