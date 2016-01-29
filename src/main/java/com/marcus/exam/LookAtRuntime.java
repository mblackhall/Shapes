package com.marcus.exam;

import java.util.Date;

/**
 * @author marcus
 */
public class LookAtRuntime {

    public static void main(String[] args) throws InterruptedException {

        Runtime rt = Runtime.getRuntime();

        System.out.println("Total JVM memory: "
                + rt.totalMemory());
        System.out.println("Before Free Memory = "
                + rt.freeMemory());
        Date d = null;

        for (int i = 0; i < 10000; i++) {
            d = new Date();
            d = null;
        }

        System.out.println("After Free Memory = "
                + rt.freeMemory());
        rt.gc();
// an alternate to System.gc()

        System.out.println("After GC Free Memory = "
                + rt.freeMemory());
    }

}
