package com.tests.designPatterns.gof.behaviour.templateMethod;

public abstract class DataExporter {
    // Template method - defines the algorithm structure
    public final void export(String data) {
        openFile();
        writeData(data);
        closeFile();
    }

    // Common steps with default implementations
    protected void openFile() {
        System.out.println("Opening file...");
    }

    protected void closeFile() {
        System.out.println("Closing file...");
    }

    // Abstract method - must be implemented by subclasses
    protected abstract void writeData(String data);
}
