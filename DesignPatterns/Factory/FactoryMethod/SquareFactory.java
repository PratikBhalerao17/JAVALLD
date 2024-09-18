package org.example.DesignPatterns.Factory.FactoryMethod;

public class SquareFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Square();
    }
}
