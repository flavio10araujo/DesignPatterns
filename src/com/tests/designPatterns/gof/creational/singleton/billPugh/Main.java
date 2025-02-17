package com.tests.designPatterns.gof.creational.singleton.billPugh;

public class Main {
    public static void main(String[] args) {
        Singleton object = Singleton.getInstance();
        object.showMessage();
    }
}
