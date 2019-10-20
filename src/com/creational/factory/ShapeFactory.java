package com.creational.factory;

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
