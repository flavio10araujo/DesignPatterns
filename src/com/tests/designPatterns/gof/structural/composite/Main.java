package com.tests.designPatterns.gof.structural.composite;

public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("Document.pdf");
        FileSystemComponent file2 = new File("Photo.jpg");
        Folder folder1 = new Folder("MyFolder");
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        FileSystemComponent file3 = new File("Presentation.ppt");

        Folder rootFolder = new Folder("Root");
        rootFolder.addComponent(folder1);
        rootFolder.addComponent(file3);

        rootFolder.showDetails("");
    }
}
