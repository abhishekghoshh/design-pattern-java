package com.creational.abstractFactory.abstractFactory;

import com.creational.abstractFactory.colors.Color;
import com.creational.abstractFactory.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}