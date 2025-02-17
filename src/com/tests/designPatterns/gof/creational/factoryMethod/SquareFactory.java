package com.tests.designPatterns.gof.creational.factoryMethod;

public class SquareFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
