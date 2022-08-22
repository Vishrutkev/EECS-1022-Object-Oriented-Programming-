package Final;

import java.util.ArrayList;
import java.util.*;

public class inrttdf {

    public static void swap(int[] a, int[] b){
        int[] temp = {0};
        temp[0] = a[0];
        a[0] = b[0];
        b[0] = temp[0];
    }

    public static boolean min(int[] a){
        int ans = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] <= a[i+1]){
                ans++;
            }
        }
        return (ans == a.length-1);
    }

    public static void main(String[] args) {
        int[] a = {10};
        int[] b = {20};
        System.out.println("a : " + a[0]);
        System.out.println("b : " + b[0]);
        swap(a,b);
        System.out.println("after ");
        System.out.println("a : " + a[0]);
        System.out.println("b : " + b[0]);


        int[] ds = {2,4,3,3};
        System.out.println(min(ds));
        int[] ans = new int[10];

        min(ds);

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            if (i == 4 ){
                System.out.println(">");
            }else {
                System.out.println();
            }

        }

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        int[][] sdd = new int[4][];


        }
    }

