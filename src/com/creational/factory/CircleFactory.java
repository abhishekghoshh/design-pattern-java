package com.creational.factory;

public class CircleFactory extends AbstractFactory{

	@Override
	protected Shape factoryMethod() {
		return new Circle();
	}

	
}
