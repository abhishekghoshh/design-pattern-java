package com.structural.facade.hotel.resturant;

import com.structural.facade.hotel.menu.VegMenu;

public class VegRestaurant implements Restaurant {

	@Override
	public VegMenu getMenus() {
		return new VegMenu();
	}

}
