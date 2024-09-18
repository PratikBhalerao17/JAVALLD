package org.example.DesignPatterns.Factory.FactoryMethod;

public class CircleFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
