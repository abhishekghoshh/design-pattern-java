package com.creational.factory;

public class RectangularFactory extends AbstractFactory{

	@Override
	protected Shape factoryMethod() {
		// TODO Auto-generated method stub
		return new Rectangle();
	}

}
