package com.tests.designPatterns.simpleFactory.implementationClassRegistration.withReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	@SuppressWarnings("rawtypes")
	private Map<String, Class> registeredShapesMap = new HashMap<>();

	public void registerShape(String shapeID, @SuppressWarnings("rawtypes") Class class1) {
		registeredShapesMap.put(shapeID, class1);
	}

	@SuppressWarnings("unchecked")
	public Shape getShape(String shapeID)  {
		try {
			@SuppressWarnings("rawtypes")
			Class shape = (Class) registeredShapesMap.get(shapeID);

			@SuppressWarnings("rawtypes")
			Constructor constructor = shape.getConstructor();

			return (Shape) constructor.newInstance();
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			e.printStackTrace();
		}

		return null;
	}
}
