package com.tests.designPatterns.gof.behaviour.visitor.example02;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        ShapeVisitor areaCalculator = new AreaCalculator();
        ShapeVisitor renderer = new RenderingVisitor();

        System.out.println("Applying Area Calculation:");
        circle.accept(areaCalculator);
        rectangle.accept(areaCalculator);

        System.out.println("\nApplying Rendering:");
        circle.accept(renderer);
        rectangle.accept(renderer);
    }
}
