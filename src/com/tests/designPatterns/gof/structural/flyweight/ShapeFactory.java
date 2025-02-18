package com.tests.designPatterns.gof.structural.flyweight;

import java.util.HashMap;

// Flyweight Factory
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating new Circle of color: " + color);
        }

        return circle;
    }
}
