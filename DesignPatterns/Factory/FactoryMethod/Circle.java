package org.example.DesignPatterns.Factory.FactoryMethod;

import org.example.DesignPatterns.Factory.FactoryMethod.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside the circle concrete class");
    }
}
