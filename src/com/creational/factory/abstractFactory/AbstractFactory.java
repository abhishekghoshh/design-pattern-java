package com.creational.factory.abstractFactory;

import com.creational.factory.shapes.Shape;

public abstract class AbstractFactory {

	protected abstract Shape factoryMethod();
	public Shape getShape() {
		return this.factoryMethod();
	}
}
