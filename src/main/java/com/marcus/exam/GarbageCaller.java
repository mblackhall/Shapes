package com.marcus.exam;

/**
 * @author marcus
 */
public class GarbageCaller {

    public static void main(String[] args) throws InterruptedException {
        new ExamineGarbage().method1();

        System.gc();

        Thread.sleep(10);


    }
}

