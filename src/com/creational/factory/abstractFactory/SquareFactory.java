package com.creational.factory.abstractFactory;

import com.creational.factory.shapes.Shape;
import com.creational.factory.shapes.Square;

public class SquareFactory extends AbstractFactory{

	@Override
	protected Shape factoryMethod() {
		return new Square();
	}

}
