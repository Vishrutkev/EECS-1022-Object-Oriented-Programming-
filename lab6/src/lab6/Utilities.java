package lab6;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

import java.util.Arrays;

public class Utilities {
    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] getMultiplesOf3(int[] numbers) {

        /* TODO: Your implementation ends here. */

        /* Your implementation of this method starts here.
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */
        int n = 0;
        int[] result = new int[0];
        int count = 0;
        if (numbers.length == 0) {
            return result;
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 3 == 0) {
                    count++;
                }
            }
        }
        result = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                result[n] = numbers[i];
                n++;
            }
        }

        return result; // You need to replace this line by returning the proper result.
    }

    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Assumptions:
     * 	- numbers.length >= 1
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static String[] getAllPrefixes(int[] numbers) {

        /* TODO: Your implementation ends here. */

        String[] ans = new String[numbers.length];


        for (int i = 0; i < numbers.length; i++) {

            String temp = "[" + numbers[0];
            for (int j = 1; j <= i; j++) {
                temp += ", " + numbers[j];
            }
            temp += "]";
            ans[i] = temp;
        }

        return ans;
    }

    /* Your implementation of this method starts here.
     * 1. No System.out.println statements should appear here.
     * 	  Instead, you need to return the result.
     * 2. No Scanner operations should appear here (e.g., input.nextInt()).
     *    Instead, refer to the input parameters of this method.
     */
    // You need to replace this line by returning the proper result.


    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] getGroupedNumbers(int[] numbers) {

        /* TODO: Your implementation ends here. */

        int[] ans = new int[numbers.length];
        int n = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                ans[n] = numbers[i];
                n++;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 1) {
                ans[n] = numbers[i];
                n++;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 2) {
                ans[n] = numbers[i];
                n++;
            }
        }

        /* Your implementation of this method starts here.
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */
        return ans; // You need to replace this line by returning the proper result.
    }

    /*
     * Input parameters:
     * 	- `twoDimArray` : a 2D array of integers
     *
     * Note: the sub-arrays may have different sizes.
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] zigZagFlatten(int[][] twoDimArray) {

        /* TODO: Your implementation ends here. */
        int n = 0;
        int sum = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            sum += twoDimArray[i].length;
        }
        int[] ans = new int[sum];

        for (int i = 0; i < twoDimArray.length; i++) {
            if (i % 2 == 1) {
                for (int j = twoDimArray[i].length - 1; j >= 0; j--) {
                    ans[n] = twoDimArray[i][j];
                    n++;
                }

            } else {
                for (int j = 0; j < twoDimArray[i].length; j++) {
                    ans[n] = twoDimArray[i][j];
                    n++;
                }

            }



            /* Your implementation of this method starts here.
             * 1. No System.out.println statements should appear here.
             * 	  Instead, you need to return the result.
             * 2. No Scanner operations should appear here (e.g., input.nextInt()).
             *    Instead, refer to the input parameters of this method.
             */
            // You need to replace this line by returning the proper result.
        }
        return ans;
    }
}