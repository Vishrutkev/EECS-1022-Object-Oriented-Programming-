package Week10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class numgame {

    private static int[] randNumList = {};

    public static int[] generateRandomNumber(int difficulty) {
        Random rnd = new Random();
        for (int i = 0; i < difficulty; i++) {
            int randNum = rnd.nextInt(9) + 1;
            randNumList = Arrays.copyOf(randNumList, randNumList.length + 1);
            randNumList[randNumList.length - 1] = randNum;
        }
        return randNumList;
    }
    public static int[] Int_to_array(int n)
    {
        int j = 0;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        while(n!=0)
        {
            arr[len-j-1] = n%10;
            n=n/10;
            j++;
        }
        return arr;
    }

    public static boolean trueorFalse(int[] genNum, int[] num1){
        return Arrays.equals(num1, genNum);

    }

    public static void main(String[] args) {
        int[] genNum = generateRandomNumber(3);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] num1 = Int_to_array(num);
        boolean b = trueorFalse(genNum, num1);
        System.out.println(b);

        int[] a = {1,2};
        String s = Arrays.toString(a);
        System.out.println(s);








    }
}
