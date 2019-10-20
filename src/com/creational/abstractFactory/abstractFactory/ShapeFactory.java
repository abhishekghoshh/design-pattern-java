package com.creational.abstractFactory.abstractFactory;

import com.creational.abstractFactory.colors.Color;
import com.creational.abstractFactory.shapes.Circle;
import com.creational.abstractFactory.shapes.Rectangle;
import com.creational.abstractFactory.shapes.Shape;
import com.creational.abstractFactory.shapes.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType)
    {
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

    @Override
    Color getColor(String color)
    {
        return null;
    }

}