package com.marcus.nested;

/**
 * @author marcus
 */
public class MyClassWithNested {

    Integer i = new Integer(40);


    private class NestedInstanceClass {

        Integer i = new Integer(10);

        void method1(){
            System.out.println("instance nestsed class " + i);
        }

    }

    private static class NestedStaticClass {

        Integer i = new Integer(20);

        void method1(){
            System.out.println("static nestsed class " + i);
        }

    }


    public static void main(String[] args) {

        new MyClassWithNested.NestedStaticClass().method1();
    }


}
