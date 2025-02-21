package com.tests.designPatterns.gof.behaviour.visitor.example02;

public class Rectangle implements Shape {
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
