package com.marcus.exam;

/**
 * @author marcus
 */
final public class ExamineFinal {

    final int x;
    public ExamineFinal(){
        x = 6;
    }

    public void checkFinal(){

        final int y;

        y = 5;
       //  y= 6; cannot do once initialized

    }

}
