package com.structural.facade;

import com.structural.facade.Menu;

public class NonVegMenu implements Menu {

	public NonVegMenu(){
        System.out.println("Creating a non veg menu");
    }

    public void showMenu() {
        System.out.println("Menu items in non veg menu");
    }
}
