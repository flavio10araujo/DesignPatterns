package com.tests.designPatterns.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void showDetails(String prefix) {
        System.out.println(prefix + "Folder: " + name);
        for (FileSystemComponent component : children) {
            component.showDetails(prefix + " ");
        }
    }
}
