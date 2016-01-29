package com.marcus.callers;

/**
 * @author marcus
 */
public class Test2 {


    public static void main(String[] args) {

        String[] parms = new String[]{"hhaa", "20"};
        int i = 0;
        for (String parm : parms) {
            try {

                int num = Integer.parseInt(parms[i++]);
                int[] scores = {5, 6, 7};
                System.out.println(scores[i+5]);

            } catch (NumberFormatException e) {
                System.out.println(" I got a " + e.getClass().getSimpleName());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(" I got a " + e.getClass().getSimpleName());
            } finally {
                // finally done if an error occors or No error - so always (unless jvm stops !)
                System.out.println("in finally block with " + parm);
            }
        }


    }
}
