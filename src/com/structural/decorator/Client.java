package com.structural.decorator;

import com.structural.decorator.decorator.FriedRice;
import com.structural.decorator.food.Food;
import com.structural.decorator.food.NonVegFood;
import com.structural.decorator.food.VegFood;

public class Client {

	public static void print(Food food) {
		System.out.println("------------");
		System.out.println(food.getName());
		System.out.println(food.getPrice());
		System.out.println(food.getDescription());
	}
	
	public static void main(String[] args) {
		Food veg = new VegFood();
		print(veg);
		Food vegFriedRice = new FriedRice(veg);
		print(vegFriedRice);
		
		Food nonVeg = new NonVegFood();
		print(nonVeg);
		Food nonVegFriedRice = new FriedRice(nonVeg);
		print(nonVegFriedRice);
	}

}
