package com.tests.designPatterns.gof.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy("high_resolution_photo.jpg");

        // Image is not loaded yet
        System.out.println("First display call:");
        image.display();  // Loads image from disk

        System.out.println("Second display call:");
        image.display();  // Uses cached object
    }
}
