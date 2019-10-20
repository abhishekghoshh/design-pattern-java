package com.creational.factory.abstractFactory;

import com.creational.factory.shapes.Rectangle;
import com.creational.factory.shapes.Shape;

public class RectangularFactory extends AbstractFactory{

	@Override
	protected Shape factoryMethod() {
		// TODO Auto-generated method stub
		return new Rectangle();
	}

}
