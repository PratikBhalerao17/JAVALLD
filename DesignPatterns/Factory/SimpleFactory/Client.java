package org.example.DesignPatterns.Factory.SimpleFactory;

//This class don't know the behaviour of my product concrete classes it only knows teh factory
public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //Here my application is not directly depends on the concrete class but the factory class so loose coupling.
        // Still here we are using some class & in future we might need to change the implementation of getShape method
        // to have new shape in our code. To avoid this instead of using class we can use abstract class or interface.
        // To avoid this we can use factory method
        Shape circleShape = shapeFactory.getShape("CIRCLE");
        circleShape.draw(); // Inside Circle class
        Shape rectangleShape = shapeFactory.getShape("RectanGle");
        rectangleShape.draw(); // Inside the Rectangle Class
        Shape nullShape = shapeFactory.getShape("");
        System.out.println(nullShape.hashCode()); // exception as it will return null
    }
}
