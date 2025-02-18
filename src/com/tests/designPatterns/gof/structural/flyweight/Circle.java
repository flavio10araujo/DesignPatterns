package com.tests.designPatterns.gof.structural.flyweight;

// Concrete Flyweight
public class Circle implements Shape {
    private final String color; // Intrinsic (Shared) state
    private int x, y, radius;   // Extrinsic (Unique) state

    public Circle(String color) {
        this.color = color; // Shared across multiple objects
    }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setRadius(int radius) { this.radius = radius; }

    @Override
    public void draw() {
        System.out.println("Drawing " + color + " circle at (" + x + "," + y + ") with radius " + radius);
    }
}
