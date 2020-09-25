package com.creational.prototype.shape;

public class Rectangle extends Shape{
	public Rectangle(String id,String description) {
		super.id = id;
		super.description=description;
	}

	@Override
	public void draw() {
		System.out.println("I am a Rectangle");
	}
}
