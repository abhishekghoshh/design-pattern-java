package com.structural.facade.hotel.resturant;

import com.structural.facade.hotel.menu.BothMenu;

public class BothRestaurant implements Restaurant {

	public BothMenu getMenus(){
       return new BothMenu();
    }

}
