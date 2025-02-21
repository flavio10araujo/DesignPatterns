package com.tests.designPatterns.gof.behaviour.visitor.example02;

public class Circle implements Shape {
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);  // Calls visitor's visit method
    }
}
