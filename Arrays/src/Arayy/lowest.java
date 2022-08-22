package Arayy;

import java.util.Arrays;

import static java.util.Arrays.*;

public class lowest {

    public static int[] lowestNumbers(int[] a) {

        for (int i = 0; i < a.length ; i++) {
            sort(a);

        }
        return new int[]{a[0],a[1]};
    }


    public static void main(String[] args) {

        int[] abc = {22,55,77,32,11,22,6,44,2,44,11,55,23,5,245,854,674,0};
        System.out.println(Arrays.toString(lowestNumbers(abc)));;


    }
}
