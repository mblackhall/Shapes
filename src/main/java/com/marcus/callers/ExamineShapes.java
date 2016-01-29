package com.marcus.callers;

import com.marcus.inheritance.model.ShapeFactory;
import com.marcus.inheritance.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marcus
 */
public class ExamineShapes {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(ShapeFactory.makeRectangle(5,6));
        shapes.add(ShapeFactory.makeSquare(4));
        shapes.add(ShapeFactory.makeTriangle(3,4,5));
        shapes.add(ShapeFactory.makeCircle(10.5));
        for(Shape shape: shapes){
            System.out.println(shape.toString());
        }

    }
}
