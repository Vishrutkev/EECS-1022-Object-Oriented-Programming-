package NestedLoops;

import java.util.Random;

public class week7 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[5];
        a[0] = 3;
        System.out.println(a[0]);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(51) + 50;


        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");

        }
        System.out.println();
        for (int e : a ) {
            System.out.print(e + ", ");


        }

    }
}
