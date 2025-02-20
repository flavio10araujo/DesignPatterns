package com.tests.designPatterns.gof.behaviour.interpreter;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Construct the expression (10 + 2) - 3
        Expression expression = new SubtractExpression(new AddExpression(new NumberExpression(10), new NumberExpression(2)), new NumberExpression(3));

        // Interpret the expression
        int result = expression.interpret(Map.of());
        System.out.println("Result: " + result); // Output: 9
    }
}
