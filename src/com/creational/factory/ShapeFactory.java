package com.creational.factory;

import com.creational.factory.shapes.Circle;
import com.creational.factory.shapes.Rectangle;
import com.creational.factory.shapes.Shape;
import com.creational.factory.shapes.Square;

public class ShapeFactory {

	public Shape getShape(String shape) {
		switch(shape.toUpperCase()) {
			case "CIRCLE":
				return new Circle();
			case "RECTANGLE":
				return new Rectangle();
			case "SQUARE":
				return new Square();
			default:
				throw new RuntimeException("Shape : "+shape+" is unknown");
		}
	}
	
	public static Shape staticGetShape(String shape) {
		switch(shape.toUpperCase()) {
		case "CIRCLE":
			return new Circle();
		case "RECTANGLE":
			return new Rectangle();
		case "SQUARE":
			return new Square();
		default:
			throw new RuntimeException("Shape : "+shape+" is unknown");
	}
	}
}
