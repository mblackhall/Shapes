package com.marcus.callers;

/**
 * @author marcus
 */

class Another {

    public static void mymethod(){
        System.out.println("im another");

    }
}
public class HiddenMethodExample extends Another  {


    public  static void mymethod(){
        System.out.println("im hidden");

    }

    public static void main(String[] args) {

        Another a = new HiddenMethodExample();
        a.mymethod();
        HiddenMethodExample hidden = new HiddenMethodExample();
        hidden.mymethod();

    }

}
