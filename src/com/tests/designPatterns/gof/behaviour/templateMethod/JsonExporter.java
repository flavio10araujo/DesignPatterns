package com.tests.designPatterns.gof.behaviour.templateMethod;

public class JsonExporter extends DataExporter {
    @Override
    protected void writeData(String data) {
        System.out.println("Writing JSON data: " + data);
    }
}
