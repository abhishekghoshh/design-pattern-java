package com.creational.factory;

public class CircleFactory extends AbstractFactory{

	@Override
	protected Shape factoryMethod() {
		// TODO Auto-generated method stub
		return new Circle();
	}

	
}
