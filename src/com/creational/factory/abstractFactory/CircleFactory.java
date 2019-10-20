package com.creational.factory.abstractFactory;

import com.creational.factory.shapes.Circle;
import com.creational.factory.shapes.Shape;

public class CircleFactory extends AbstractFactory{

	@Override
	protected Shape factoryMethod() {
		// TODO Auto-generated method stub
		return new Circle();
	}

	
}
