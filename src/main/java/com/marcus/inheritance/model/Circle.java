package com.marcus.inheritance.model;

/**
 * @author marcus
 */

/**
 * @author marcus
 */
public class Circle extends Shape {


    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI* radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double getadius() {
        return radius;
    }


    @Override
    public String toString() {
        return   String.format("Circle of radius %5.2f has area %5.2f and perimeter %5.2f",radius,area(),perimeter());
    }



}
