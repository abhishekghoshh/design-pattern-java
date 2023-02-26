package com.creational.factory;

public abstract class AbstractFactory {

	protected abstract Shape factoryMethod();
	public Shape getShape() {
		return this.factoryMethod();
	}
}
