package com.tests.designPatterns.gof.creational.factoryMethod;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
