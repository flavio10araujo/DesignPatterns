package com.tests.designPatterns.gof.creational.factoryMethod;

public abstract class ShapeFactory {
    // Factory Method
    public abstract Shape createShape();

    public void drawShape() {
        Shape shape = createShape();
        shape.draw();
    }
}
