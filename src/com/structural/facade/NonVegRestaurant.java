package com.structural.facade;

public class NonVegRestaurant implements Restaurant {

	@Override
	public NonVegMenu getMenus() {
		return new NonVegMenu();
	}
}
