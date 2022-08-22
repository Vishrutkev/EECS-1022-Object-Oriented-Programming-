package Arayy;

import java.awt.*;
import java.util.Arrays;

public class addarray {

    public static void main(String[] args) {

        int[] num = new int[5];
        System.out.println(Arrays.toString(num));
        num[2] = 5;
        System.out.println(Arrays.toString(num));
        num[2] = 10;
        System.out.println(Arrays.toString(num));
        Rectangle[] rect = new Rectangle[5];
        System.out.println(rect.length);
        int x = 2*3;
        int[] data = new int[x%5];
        System.out.println(data.length);


        int[] a = new int[10];
        for (int i=0; i<a.length; i++){
            a[i] = 1 ;
        }
        System.out.println(Arrays.toString(a));

        String str = "abc";
        System.out.println(str.length());


    }

}
