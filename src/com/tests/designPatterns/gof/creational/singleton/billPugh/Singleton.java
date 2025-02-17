package com.tests.designPatterns.gof.creational.singleton.billPugh;

public class Singleton {
    private Singleton() {}

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton(); // Lazy initialization (Instance is created only when needed).
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
