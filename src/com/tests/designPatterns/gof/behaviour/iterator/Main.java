package com.tests.designPatterns.gof.behaviour.iterator;

public class Main {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            System.out.println("Name: " + iter.next());
        }
    }
}
