package com.structural.facade;

public class BothRestaurant implements Restaurant {

	public BothMenu getMenus(){
       return new BothMenu();
    }

}
