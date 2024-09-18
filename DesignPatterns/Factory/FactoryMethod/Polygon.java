package org.example.DesignPatterns.Factory.FactoryMethod;

public class Polygon implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing inside the polygon concrete class");
    }
}
