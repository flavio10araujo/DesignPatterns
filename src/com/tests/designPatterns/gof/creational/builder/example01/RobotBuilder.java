package com.tests.designPatterns.gof.creational.builder.example01;

//Defines the methods needed for creating parts for the robot.
public interface RobotBuilder {
	public void buildRobotHead();
	public void buildRobotTorso();
	public void buildRobotArms();
	public void buildRobotLegs();
	public Robot getRobot();
}
