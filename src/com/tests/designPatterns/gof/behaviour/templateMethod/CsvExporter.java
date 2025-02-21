package com.tests.designPatterns.gof.behaviour.templateMethod;

public class CsvExporter extends DataExporter {
    @Override
    protected void writeData(String data) {
        System.out.println("Writing CSV data: " + data);
    }
}
