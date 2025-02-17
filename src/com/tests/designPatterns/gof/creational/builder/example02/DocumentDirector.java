package com.tests.designPatterns.gof.creational.builder.example02;

public class DocumentDirector {
    private DocumentBuilder builder;

    public DocumentDirector(DocumentBuilder builder) {
        this.builder = builder;
    }

    public Document construct(String content) {
        builder.setContent(content);
        return builder.build();
    }
}
