package org.example.DesignPatterns.Factory.FactoryMethod;

public class RectangleFactory extends ShapeFactory{

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}


