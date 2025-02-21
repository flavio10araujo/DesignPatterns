package com.tests.designPatterns.gof.behaviour.templateMethod;

public class Main {
    public static void main(String[] args) {
        DataExporter csvExporter = new CsvExporter();
        csvExporter.export("Sample Data");

        System.out.println("-----------------");

        DataExporter jsonExporter = new JsonExporter();
        jsonExporter.export("Sample Data");
    }
}
