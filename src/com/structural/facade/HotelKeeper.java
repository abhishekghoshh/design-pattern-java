package com.structural.facade;

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
