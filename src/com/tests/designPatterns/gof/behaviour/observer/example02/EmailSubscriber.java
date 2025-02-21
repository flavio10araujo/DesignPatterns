package com.tests.designPatterns.gof.behaviour.observer.example02;

public class EmailSubscriber implements Observer {
    private final String name;

    public EmailSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news via email: " + news);
    }
}
