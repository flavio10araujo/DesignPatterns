package com.tests.designPatterns.gof.behaviour.observer.example02;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private final List<Observer> observers = new ArrayList<>();
    private String latestNews;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setLatestNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }
}
