package com.structural.decorator.decorator;

import com.structural.decorator.food.Food;

public abstract class FoodDecorator implements Food {

	private Food food;
	
	public FoodDecorator(Food food) {
		this.food=food;
	}
	@Override
	public String getName() {
		return food.getName();
	}

	@Override
	public String getDescription() {
		return food.getDescription();
	}

	@Override
	public double getPrice() {
		return food.getPrice();
	}

}
