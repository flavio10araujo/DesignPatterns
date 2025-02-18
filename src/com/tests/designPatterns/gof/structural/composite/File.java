package com.tests.designPatterns.gof.structural.composite;

public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails(String prefix) {
        System.out.println(prefix + "File: " + name);
    }
}
