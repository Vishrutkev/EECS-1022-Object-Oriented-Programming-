package Arayy;

import java.util.Arrays;

public class Exercise {

    public static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
            b[j] = a[i];
        }
        return b;

    }

    public static String containpositive(int[] ab) {
        for (int i = 0; i < ab.length; i++) {
            if (ab[i] <= 0)
                return "Array contains at least one negative or 0.";

        }
        return "Array contains all positive numbers.";
    }

    public static void arrange(int[] abc) {
        boolean isSorted = true;
        for (int i = 0; isSorted && i < abc.length - 1; i++) {
            isSorted = abc[i] <= abc[i + 1];
        }
        if (isSorted) {
            System.out.println("Arrays are sorted in a increasing order");
        } else {
            System.out.println("Arrays are not sorted in a non-decreasing order");
        }


    }








    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        int[] num = Exercise.reverse(numbers);
        System.out.println(Arrays.toString(num));

        int[] negative = {1,2,4,5,0,-3};
        String containpositive = containpositive(negative);
        System.out.println(containpositive);

        int[] ascending = {1,2,2,4};
        arrange(ascending);

        int[] descending = {2,4,3,3};
        arrange(descending);




    }

}
