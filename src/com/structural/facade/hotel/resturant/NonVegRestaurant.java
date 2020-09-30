package com.structural.facade.hotel.resturant;

import com.structural.facade.hotel.menu.NonVegMenu;

public class NonVegRestaurant implements Restaurant {

	@Override
	public NonVegMenu getMenus() {
		return new NonVegMenu();
	}
}
