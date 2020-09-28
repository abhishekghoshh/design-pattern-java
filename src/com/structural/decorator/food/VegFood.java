package com.structural.decorator.food;

public class VegFood implements Food {
	
	@Override
	public String getName() {
		return "veg food";
	}

	@Override
	public String getDescription() {
		return "This is a veg food";
	}

	@Override
	public double getPrice() {
		return 50;
	}

}
