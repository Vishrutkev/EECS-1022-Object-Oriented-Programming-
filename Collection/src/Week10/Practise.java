package Week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Practise {

    public static void showArray(char[] a)
    {
        int i;
        System.out.println();
        for(i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static boolean equals(int[] a,
                                 int[] b)
    {
        boolean match = false;
        if (a.length == b.length)
        {
            match = true; //tentatively
            int i = 0;
            while (match && (i < a.length))
            {
                if (a[i] != b[i])
                    match = false;
                i++;
            }
        }
        return match;
    }

    public static int[] reverse(int[] a){
        int num = 0;
        int[] ans = new int[a.length];
        while (num++ < a.length){
            for (int i = 0, j = a.length - 1; i < a.length; i++, j--){
                ans[j] = a[i];
            }
        }
        return ans;
    }

    public static double average(int[][] a){
        double total = 0;
        int totalElements = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                total += a[i][j];
                totalElements++;
            }

        }
        double average = total/totalElements;
        return average;
    }

    /**
     * Q1. Given a 2D array a of integers, find out the
     * row which has the maximum sum, and return that
     * sum.
     * @param a
     * @return
     */

    public static int maxSumrow(int[][] a ){
        int max = 0;
        int row = 0;
        int[] arr = new int[a.length];
        int sum;
            for (int i = 0; i < a.length; i++) {
                sum = 0;
                for (int j = 0; j < a[i].length; j++) {
                    sum += a[i][j];
                }
                arr[i] = sum;
                row = i;
            }
        System.out.println("Maximum sum in a row is row#: " + row);


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max)
                max = arr[i];
        }


        return max;
    }

    public static void main(String[] args) {
        int x = (int) Math.pow(10, 3);
        System.out.println(x);

        double x1 = (int) 3;
        System.out.println(x1);

        int y = (int) (3.54 + 0.46);
        System.out.println((y));

        int num = 1022;
        double dou = 9.5;

        String str = String.format("%.2f", dou);
        String str2 = String.format("%-10d", num);
        System.out.println(str);
        System.out.println(str2);

        Random rnd = new Random();
        int as = rnd.nextInt(7) + 2;
        System.out.println(as);

        double ds = rnd.nextDouble();
        double gpa = ds * 1.652 + 2.5;
        System.out.println(gpa);

        String name1 = "111";
        String name2 = "ABC";
        System.out.println(name1.compareTo(name2));

        //Array------

        int[] numArray = new int[5];
        numArray = new int[numArray.length + 1];
        System.out.println(numArray.length);
        for (int e : numArray) {
            System.out.print(e + " ");
        }
        num = 0;
        System.out.println();
        for (int w: numArray) {
            w = num++;
            System.out.print(w + " ");
        }

        String[] st = new String[5];
        System.out.println();
        for (String e : st) {
            System.out.print(e + " ");
        }

        char[] grades = new char[45];
        Practise.showArray(grades);

        int[] ab = {1,2,3,4,5};
        System.out.println();
        for (int e: ab) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(ab));

        int[] abc = {1,2,3,4,5};
//        System.out.println(Practise.equalss(ab,abc));

        System.out.println(Arrays.binarySearch(ab,3));
        System.out.println(Arrays.toString(Arrays.copyOf(abc, 5)));
        int[] abcd = Arrays.copyOf(abc, 5);


        System.out.println(Arrays.toString(reverse(abc)));

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = 4; i >= 1  ; i--) {
            for (int j = i; j>=1  ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        int[][] a = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        System.out.println(average(a));

        System.out.println((maxSumrow(a)));


        int[][] ans = new int[4][4];

        ans = new int[4][2*4];

        System.out.println(ans[2].length);

        List <String> alist = new ArrayList<>(5);
        System.out.println(alist.add("ab"));
        alist.add("bc");
        System.out.println(alist.get(0));

        for (int i = 0; i < 5; i++) {
            alist.add(0,"A"+i);
        }
        System.out.println(alist);
        System.out.println(alist.indexOf("A0"));

     







    }
}
