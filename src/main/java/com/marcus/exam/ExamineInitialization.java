package com.marcus.exam;

/**
 * @author marcus
 */
public class ExamineInitialization {

    int x=4, y =x +5, j =z;


    static int z = 5;
    static double area = area();
    static {
        // code block;

    }

    public ExamineInitialization() {

        System.out.println(area);
    }

    static double area (){
        return Math.PI * z * z;
    }


    public static void main(String[] args) {
        new ExamineInitialization();
    }
}
