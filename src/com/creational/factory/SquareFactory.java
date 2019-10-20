package com.creational.factory;

public class SquareFactory extends AbstractFactory{

	@Override
	protected Shape factoryMethod() {
		// TODO Auto-generated method stub
		return new Square();
	}

}
