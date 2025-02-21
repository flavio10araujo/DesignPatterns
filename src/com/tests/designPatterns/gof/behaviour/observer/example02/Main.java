package com.tests.designPatterns.gof.behaviour.observer.example02;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer user1 = new EmailSubscriber("Alice");
        Observer user2 = new MobileAppSubscriber("Bob");

        agency.addObserver(user1);
        agency.addObserver(user2);

        agency.setLatestNews("Breaking: Observer Pattern is still relevant!");
    }
}
