package NestedLoops;


import java.util.Arrays;

public class Arrayss {

    public static double average2D(int [] [] inputArray){
        int total = 0;
        int numofElements = 0;

        for (int row = 0; row < inputArray.length; row++) {
            for (int col = 0; col < inputArray[row].length; col++){
                total += inputArray[row][col];
                numofElements ++;

            }

        }
        double average = (((double) total) / numofElements);
        return Math.round(average * 100.0) / 100.00;

    }

    public static int [] minmax2D(int[] [] inputArray){
        int max  = inputArray[0][0];
        int min = inputArray[0][0];
        int[] result = new int [2];
        for (int row = 0; row < inputArray.length; row++) {
            for (int col = 0; col < inputArray[row].length; col++) {
                if (inputArray[row][col] > max){
                    max = inputArray[row][col];
                }

                if (inputArray[row][col] < min){
                    min = inputArray[row][col];
                }
            }
        }
        result[0] = min;
        result[1] = max;
        return result;
    }



    public static void main(String[] args) {
        int [] [] table = new int[3][4];
        System.out.println(table[0].length);

        int [] [] array = {
                {100,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        System.out.println("Min/Max: " + Arrays.toString(minmax2D(array)));
        System.out.println("array: " +average2D(array));
        System.out.println(array[0][1]);

        int [][] triangleArray = {
                {1,2,3,4,5},
                {2,3,4,5},
                {3,4,5},
                {4,5},
                {5}
        };
        System.out.println("Min/Max: " + Arrays.toString(minmax2D(triangleArray)));
        System.out.println("triangleArray: " +(average2D(triangleArray)));
        System.out.println(triangleArray.length);
    }


}
