package com.creational.factory;

public class SquareFactory extends AbstractFactory{

	@Override
	protected Shape factoryMethod() {
		return new Square();
	}

}
