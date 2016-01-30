package com.marcus.exam;

/**
 * @author marcus
 */
public class GarbageCaller {

    public static void main(String[] args) throws InterruptedException {
        new ExamineGarbage().method1();
        System.gc();  // please run a garabge collection for me
        Thread.sleep(10);  // give it time abge col
        //  ? did the finalize method get run then you know gargabe collector was bisy !


    }
}

