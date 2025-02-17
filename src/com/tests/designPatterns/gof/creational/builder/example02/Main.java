package com.tests.designPatterns.gof.creational.builder.example02;

public class Main {
    public static void main(String[] args) {
        DocumentBuilder pdfBuilder = new PDFDocumentBuilder();
        DocumentDirector director = new DocumentDirector(pdfBuilder);
        Document pdf = director.construct("This is a PDF");
        pdf.show();

        DocumentBuilder textBuilder = new TextDocumentBuilder();
        director = new DocumentDirector(textBuilder);
        Document text = director.construct("This is a Text File");
        text.show();
    }
}
