package NestedLoops;

import java.util.Random;
import java.util.*;

public class evenNum {

    public static int counteven(int[] checkeven) {
        int count = 0;
        for (int e : checkeven) {
            if (e % 2 == 0)
                count++;

        }
        return count;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];
        int trials = 10;
        int numofTrials = 0;

        while (true) {
            numofTrials++;
            for (int i = 0; i < trials; i++) {
                a[i] = rand.nextInt(21);
            }
            int count = counteven(a);
            if (count == 7) {
                System.out.println(counteven(a));
                System.out.println(Arrays.toString(a));
                break;
            }
        }
        System.out.println("Number of Trials to WIN is: " + numofTrials);
    }
}
