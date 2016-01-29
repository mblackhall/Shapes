package com.marcus.inheritance.model;

/**
 * @author marcus
 */
public class Triangle extends Shape {

    double side1, side2, side3;

     Triangle(double side1, double side2, double side3) {

        if ((side1 + side2) < side3 ||
                (side1 + side3) < side2 ||
                (side2 + side3) < side1) {
            throw new IllegalArgumentException();
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        // heros rule

        double semiPerimeter = perimeter() / 2;
        return Math.sqrt(semiPerimeter *
                (semiPerimeter - side1) *
                (semiPerimeter - side2) *
                (semiPerimeter - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
      return   String.format("Triangle with sides %5.2f,%5.2f,%5.2f has area %5.2f and perimeter %5.2f",side1,side2,side3,area(),perimeter());
    }


}
