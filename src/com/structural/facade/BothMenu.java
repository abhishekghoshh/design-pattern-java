package com.structural.facade;

public class BothMenu implements Menu {

	public BothMenu(){
        System.out.println("Creating both a non and veg menu");
    }

    public void showMenu() {
        System.out.println("Menu items in both a veg and non menu");
    }

}
