package com.tests.designPatterns.gof.behaviour.visitor.example02;

public class RenderingVisitor implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Rendering Circle on screen...");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Rendering Rectangle on screen...");
    }
}
