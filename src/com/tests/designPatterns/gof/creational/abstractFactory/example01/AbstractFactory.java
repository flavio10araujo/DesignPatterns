package com.tests.designPatterns.gof.creational.abstractFactory.example01;


public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape) ;
}
