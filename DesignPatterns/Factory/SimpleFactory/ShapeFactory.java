package org.example.DesignPatterns.Factory.SimpleFactory;
//This is a creator class or factory class which my client knows
public class ShapeFactory {
    public Shape getShape(String value){
        if (value == null)
            return null;
        else if(value.equalsIgnoreCase("circle"))
            return new Circle();
        else if (value.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else
            return null;
    }
}
