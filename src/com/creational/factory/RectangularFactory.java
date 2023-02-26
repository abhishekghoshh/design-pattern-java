package com.creational.factory;

public class RectangularFactory extends AbstractFactory{

	@Override
	protected Shape factoryMethod() {
		return new Rectangle();
	}

}
