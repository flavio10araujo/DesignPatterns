package com.tests.designPatterns.gof.behaviour.mediator;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    protected User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract void send(String message);
    abstract void receive(String message);
}
