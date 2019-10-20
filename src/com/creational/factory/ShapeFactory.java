package com.creational.factory;

import com.creational.factory.shapes.Circle;
import com.creational.factory.shapes.Rectangle;
import com.creational.factory.shapes.Shape;
import com.creational.factory.shapes.Square;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		switch (shapeType) {
		case "circle":
			return new Circle();
		case "square":
			return new Square();
		case "rectangle":
			return new Rectangle();
		default:
			return null;
		}
	}
	
	public static Shape staticGetShape(String shapeType) {
		switch (shapeType) {
		case "circle":
			return new Circle();
		case "square":
			return new Square();
		case "rectangle":
			return new Rectangle();
		default:
			return null;
		}
	}
}
