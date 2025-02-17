package com.tests.designPatterns.gof.creational.builder.example02;

public class PDFDocumentBuilder implements DocumentBuilder {
    private PDFDocument document = new PDFDocument();

    @Override
    public void setContent(String content) {
        document.setContent(content);
    }

    @Override
    public Document build() {
        return document;
    }
}
