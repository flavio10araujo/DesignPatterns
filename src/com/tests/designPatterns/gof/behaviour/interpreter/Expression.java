package com.tests.designPatterns.gof.behaviour.interpreter;

import java.util.Map;

public interface Expression {
    int interpret(Map<String, Integer> context);
}
