package com.tests.designPatterns.gof.creational.builder.example02;

public class PDFDocument implements Document {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void show() {
        System.out.println("PDF Document: " + content);
    }
}
