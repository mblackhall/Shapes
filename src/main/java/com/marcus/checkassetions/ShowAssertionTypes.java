package com.marcus.checkassetions;

/**
 * @author marcus
 *
 * assertions ae only aplied is they are active ... eg java -ea
 * to disavle assertions use java -da
 * default is disabled
 *
 *
 */
public class ShowAssertionTypes {


    private double calcAverage1(int total, int no) {

        // will only say that it is an Assertion error
        assert no > 0;

        return (double) total / no;


    }

    private double calcAverage2(int total, int no) {

        // this will give more information in the stack trace !
        assert no > 0 : "No must be greater then 0";

        return (double) total / no;


    }

    private double calcAverage3(int total, int no) {

        // shows you can also call a method to return infono
        assert no > 0 : getInfo(total, no);

        return (double) total / no;


    }

    private String getInfo(int total, int no) {
        return " Cannot calulate average of total " + total + " with a no of " + no;
    }


    public static void main(String[] args) {
        ShowAssertionTypes sat = new ShowAssertionTypes();

        //    sat.calcAverage1(100, 0);

        //  sat.calcAverage2(100,0);
        sat.calcAverage3(100, 0);


    }
}
