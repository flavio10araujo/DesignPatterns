package com.tests.designPatterns.gof.creational.builder.example02;

public class TextDocumentBuilder implements DocumentBuilder {
    private TextDocument document = new TextDocument();

    @Override
    public void setContent(String content) {
        document.setContent(content);
    }

    @Override
    public Document build() {
        return document;
    }
}
