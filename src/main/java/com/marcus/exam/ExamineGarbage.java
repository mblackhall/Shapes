package com.marcus.exam;

/**
 * @author marcus
 */
public class ExamineGarbage {

    public void method1(){
        int x = 0;

    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("I have been garbage colected");


    }


}
