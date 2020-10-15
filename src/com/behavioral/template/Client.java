package com.behavioral.template;

import com.behavioral.template.template.GlassHouse;
import com.behavioral.template.template.HouseTemplate;
import com.behavioral.template.template.WoodenHouse;

public class Client {

	public static void main(String[] args) {
		HouseTemplate houseType = null;

		houseType = new WoodenHouse();
		houseType.buildHouse();

		System.out.println("************");

		houseType = new GlassHouse();
		houseType.buildHouse();

	}

}
