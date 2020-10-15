package com.behavioral.visitor.visitable;

import com.behavioral.visitor.visitor.Visitor;

public class CD implements Visitable {
    private double price;
    private double weight;

    public CD(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
}