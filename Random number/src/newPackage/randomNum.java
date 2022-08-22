package eecs1022;

import java.util.Random;
import java.util.Scanner;

public class randomNum {


    public static void main(String[] args) {

        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int rand1 = r.nextInt(6)+1;
            System.out.print(rand1 + " | ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            double rand1 = Math.random();
            rand1 =(int) ((rand1*10)+4);
            System.out.print(rand1 + " | ");

        }
        int n, i, j, space;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        space = n - 1;
        for (j = 1; j <= n; j++)
        {
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++)
        {
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}





