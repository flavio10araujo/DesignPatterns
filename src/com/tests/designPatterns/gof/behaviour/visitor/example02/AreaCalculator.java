package com.tests.designPatterns.gof.behaviour.visitor.example02;

public class AreaCalculator implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Calculating area of a Circle...");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Calculating area of a Rectangle...");
    }
}
