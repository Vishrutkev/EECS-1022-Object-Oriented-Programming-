package newPackage;

import java.util.Random;

public class randomclass {

    public static void main(String[] args) {
        Random rand = new Random();
        int azx = rand.nextInt(10)+1;
        System.out.println(azx);
        for(int i = 0; i <= 5; i++) {
            int abc = rand.nextInt(5) + 1;
            System.out.print(abc + " ");
        }
        System.out.println(" ");
        double randonGPA = rand.nextDouble()*2.5+1.5;
        System.out.println(randonGPA);
        String str1 = "My name is vishrut";
        String str2 = "My name is vish";
        System.out.println(str1.compareTo(str2));


    }

}