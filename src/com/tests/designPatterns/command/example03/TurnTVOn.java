package com.tests.designPatterns.command.example03;

public class TurnTVOn implements Command {

	ElectronicDevice theDevice;
	
	public TurnTVOn(ElectronicDevice newDevice) {
		theDevice = newDevice;
	}
	
	public void execute() {
		theDevice.on();
	}

	public void undo() {
		theDevice.off();	
	}	
}