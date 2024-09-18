package org.example.DesignPatterns.Factory.SimpleFactory;

// This is a concrete class
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle class");
    }
}
