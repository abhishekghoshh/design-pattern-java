package com.creational.abstractFactory;

import com.creational.abstractFactory.abstractFactory.AbstractFactory;
import com.creational.abstractFactory.abstractFactory.ColorFactory;
import com.creational.abstractFactory.abstractFactory.ShapeFactory;


public class FactoryProducer {
    public static AbstractFactory getFactory(String choice)
    {

        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();

        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }

}