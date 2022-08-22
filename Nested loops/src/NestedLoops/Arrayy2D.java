package NestedLoops;

import java.util.Random;

public class Arrayy2D {

    public static void main(String[] args) {
        int[][] d2 = {{1,2,3},
                    {4,5,9,10},
                    {4,5,7}};
        for (int i = 0; i < d2.length; i++) {
            for (int j = 0; j < d2[i].length; j++) {
                System.out.print(d2[i][j] +" ");
            }
            System.out.println();

        }

        int[][] b;
        Random rand = new Random();
        int rows = rand.nextInt(10)+1;
        b = new int[rows][];
        System.out.println("Number of rows: " + b.length);
        for (int i = 0; i < b.length; i++) {
            int cols = rand.nextInt(10)+1;
            b[i] = new int[cols];
            System.out.println(b[i].length);
        }

    }
}
