package org.example.DesignPatterns.Factory.FactoryMethod;

public class PolygonFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Polygon();
    }
}
