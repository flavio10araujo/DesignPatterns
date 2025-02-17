package com.tests.designPatterns.gof.creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        circleFactory.drawShape();  // Output: Drawing a Circle

        ShapeFactory rectangleFactory = new RectangleFactory();
        rectangleFactory.drawShape();  // Output: Drawing a Rectangle

        ShapeFactory squareFactory = new SquareFactory();
        squareFactory.drawShape();  // Output: Drawing a Square
    }
}
