package com.creational.factory;

public class Client {
	
	public static void main(String[] args) {
		
		//Using abstract factory class
		Shape shape1 = new RectangularFactory().getShape();
		shape1.draw();
		Shape shape2 = new CircleFactory().getShape();
		shape2.draw();
		Shape shape3 = new SquareFactory().getShape();
		shape3.draw();
	}
}
