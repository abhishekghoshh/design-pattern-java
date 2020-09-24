package com.creational.abstractFactory.abstractFactory;

import com.creational.abstractFactory.colors.Blue;
import com.creational.abstractFactory.colors.Color;
import com.creational.abstractFactory.colors.Green;
import com.creational.abstractFactory.colors.Red;
import com.creational.abstractFactory.shapes.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        throw new RuntimeException("getShape is not Allowed");
    }

    @Override
	public Color getColor(String color) {
    	
    	switch(color.toUpperCase()) {
    		case "RED":
    			return new Red();
    		case "GREEN":
    			return new Green();
    		case "BLUE":
    			return new Blue();
    		default:
    			throw new RuntimeException("Color "+color+" is unknown");
    	}
    }
}


