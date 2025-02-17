package com.tests.designPatterns.simpleFactory.implementationClassRegistration.withoutReflection;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	private static ShapeFactory instance;
	private Map<String, Shape> registeredShapesMap = new HashMap<>();

	private ShapeFactory() {

	}

	public static synchronized ShapeFactory getInstance() {
		if (instance == null) {
			instance = new ShapeFactory();
		}

		return instance;
	}

	public void registerShape(String shapeID, Shape shape) {
		registeredShapesMap.put(shapeID, shape);
	}

	public Shape getShape(String shapeID)  {
		return ((Shape) registeredShapesMap.get(shapeID)).createShape();
	}
}
