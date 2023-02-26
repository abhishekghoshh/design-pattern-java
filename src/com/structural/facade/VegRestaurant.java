package com.structural.facade;

public class VegRestaurant implements Restaurant {

	@Override
	public VegMenu getMenus() {
		return new VegMenu();
	}

}
