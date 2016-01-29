package com.marcus.inheritance.model;

/**
 * @author marcus
 */
public class Rectangle extends Shape {

    private double width;
    private double height;

     Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return Math.abs (width * height);
    }

    @Override
    public double perimeter() {
        return 2 * ( width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return   String.format("Rectangle with sides %5.2f,%5.2f has area %5.2f and perimeter %5.2f",width,height,area(),perimeter());
    }



}