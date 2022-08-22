package Arayy;

import java.util.Random;

public class w7Ex205 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];


        int counter ;
        int trials = 0;
        while (true) {
            counter = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = rand.nextInt(20) + 10;
            }
            for (int e : a) {
                if (e % 2 == 0)
                    counter++;
            }
            if (counter == 7)
                break;
            System.out.println(counter);
            trials ++;

        }

        System.out.println("I win after " + trials + " trials --> " + counter);

    }
}
