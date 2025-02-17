package com.tests.designPatterns.gof.creational.builder.example02;

public interface DocumentBuilder {
    void setContent(String content);
    Document build();
}
