package com.marcus.inheritance.model;
/**
 * @author marcus
 */
public class Square extends Rectangle {

     Square (double sideLength) {
        super(sideLength, sideLength);
    }

    @Override
    public String toString() {
        return   String.format("Square with side %5.2f has area %5.2f and perimeter %5.2f",getWidth(),area(),perimeter());
    }

}
