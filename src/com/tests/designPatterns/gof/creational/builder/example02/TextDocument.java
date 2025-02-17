package com.tests.designPatterns.gof.creational.builder.example02;

public class TextDocument implements Document {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void show() {
        System.out.println("Text Document: " + content);
    }
}
