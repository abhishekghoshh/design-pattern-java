package com.structural.facade.hotel.kepper;

import com.structural.facade.hotel.menu.BothMenu;
import com.structural.facade.hotel.menu.NonVegMenu;
import com.structural.facade.hotel.menu.VegMenu;
import com.structural.facade.hotel.resturant.BothRestaurant;
import com.structural.facade.hotel.resturant.NonVegRestaurant;
import com.structural.facade.hotel.resturant.Restaurant;
import com.structural.facade.hotel.resturant.VegRestaurant;

public class HotelKeeper implements Keeper {

	@Override
	public VegMenu getVegMenu() {
		Restaurant restaurant = new VegRestaurant();
        VegMenu vegMenu = (VegMenu)restaurant.getMenus();
        return vegMenu;
	}

	@Override
	public NonVegMenu getNonVegMenu() {
		Restaurant restaurant = new NonVegRestaurant();
        NonVegMenu nonNegMenu = (NonVegMenu)restaurant.getMenus();
        return nonNegMenu;
	}

	@Override
	public BothMenu getBothMenu() {
		Restaurant restaurant = new BothRestaurant();
        BothMenu BothMenu = (BothMenu)restaurant.getMenus();
        return BothMenu;
	}

}
