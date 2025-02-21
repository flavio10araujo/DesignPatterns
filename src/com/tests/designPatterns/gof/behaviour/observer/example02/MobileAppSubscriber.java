package com.tests.designPatterns.gof.behaviour.observer.example02;

public class MobileAppSubscriber implements Observer {
    private final String name;

    public MobileAppSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news via mobile app: " + news);
    }
}
