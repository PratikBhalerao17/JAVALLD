package org.example.DesignPatterns.Factory.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        //Let's create the shapeFactory object
        // We are calling the abstract class of factory and provide the implementation factory class.
        // We can add new class or shape here without making the changes to existing code
        ShapeFactory circleFactory = new CircleFactory();
        Shape shape1 = circleFactory.createShape();
        shape1.draw(); // Inside the circle concrete class

        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape shape2 = rectangleFactory.createShape();
        shape2.draw(); // Inside the rectangle concrete class

        ShapeFactory squareFactory = new SquareFactory();
        Shape shape3 = squareFactory.createShape();
        shape3.draw(); // Inside the square concrete class

        //we have added polygon without making any changes in existing code
        // we add separate polygon class which implements Shape interface
        // Then we create a polygonFactory class which extends ShapeFactory class & implement createShape() method

        ShapeFactory polygonFactory = new PolygonFactory();
        Shape shape4 = polygonFactory.createShape();
        shape4.draw();


    }
}
