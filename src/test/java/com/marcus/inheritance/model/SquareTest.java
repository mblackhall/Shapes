package com.marcus.inheritance.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author marcus
 */
public class SquareTest {

    @Test
    public void squareAreaShouldBeCorrect() {
        Shape square = new Square(5);
        assertEquals(25, square.area(), 0);
        Shape square2 = new Square(-5);
        assertEquals(25, square2.area(), 0);
        int a =7;
        byte b = 5;
        byte c = 6;
        b+= c;
    }

    @Test
    public void rectangleAreaShouldBeCorrect() {

        Shape square1 = new Rectangle(10,5);
        assertEquals(50, square1.area(), 0);
        Shape square2 = new Rectangle(-10,5);
        assertEquals(50, square2.area(), 0);
    }

}