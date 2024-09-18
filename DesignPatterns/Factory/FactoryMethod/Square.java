package org.example.DesignPatterns.Factory.FactoryMethod;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside the square concrete class");
    }
}
