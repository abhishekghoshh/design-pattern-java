package com.creational.factory;

import com.creational.factory.abstractFactory.CircleFactory;
import com.creational.factory.abstractFactory.RectangularFactory;
import com.creational.factory.abstractFactory.SquareFactory;
import com.creational.factory.shapes.Shape;

public class Client {
	
	public static void main(String[] args) {
		
		//Using abstract factory class
		Shape shape1 = new RectangularFactory().getShape();
		shape1.draw();
		Shape shape2 = new CircleFactory().getShape();
		shape2.draw();
		Shape shape3 = new SquareFactory().getShape();
		shape3.draw();
		
		//Using object method concrete shape factory class to provide shape object
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape4= shapeFactory.getShape("rectangle");
		shape4.draw();
		Shape shape5= shapeFactory.getShape("circle");
		shape5.draw();
		Shape shape6= shapeFactory.getShape("square");
		shape6.draw();
		
		//Using static method in concrete shape factory class to provide shape object
		
		Shape shape7= ShapeFactory.staticGetShape("rectangle");
		shape7.draw();
		Shape shape8= ShapeFactory.staticGetShape("circle");
		shape8.draw();
		Shape shape9= ShapeFactory.staticGetShape("square");
		shape9.draw();
	}
}
