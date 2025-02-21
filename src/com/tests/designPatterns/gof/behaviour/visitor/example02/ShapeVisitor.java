package com.tests.designPatterns.gof.behaviour.visitor.example02;

public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
