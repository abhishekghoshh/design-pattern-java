package com.creational.abstractFactory.abstractFactory;

import com.creational.abstractFactory.colors.Blue;
import com.creational.abstractFactory.colors.Color;
import com.creational.abstractFactory.colors.Green;
import com.creational.abstractFactory.colors.Red;
import com.creational.abstractFactory.shapes.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
	public Color getColor(String color) {

        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }
}


