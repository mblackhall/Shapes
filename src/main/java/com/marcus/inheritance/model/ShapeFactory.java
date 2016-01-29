package com.marcus.inheritance.model;

/**
 * @author marcus
 */
public class ShapeFactory {

    private ShapeFactory(){

    }
    public static Shape makeRectangle(double width, double height) {
        return new Rectangle(width,height);
    }

    public static Shape makeSquare(double sideLength) {
        return new Square(sideLength);
    }

    public static Shape makeTriangle(double side1,double side2,double side3) {
        return new Triangle(side1,side2,side3);
    }

    public static Shape makeCircle(double radius) {
        return new Circle(radius);
    }
}
