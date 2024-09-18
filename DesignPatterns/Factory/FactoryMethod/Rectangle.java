package org.example.DesignPatterns.Factory.FactoryMethod;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside the rectangle concrete class");
    }
}
