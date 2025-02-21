package com.tests.designPatterns.gof.behaviour.visitor.example02;

public interface Shape {
    void accept(ShapeVisitor visitor);  // Accepts a visitor
}
