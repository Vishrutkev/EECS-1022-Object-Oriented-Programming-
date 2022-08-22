package Arayy;
import java.util.Arrays;
public class Arrayss {


    public static void main(String[] args) {
        int a =4;
        double r = 5.5;
                // index:0, 1, 2, 3, 4, 5
        int[] w7array = {23,54,75,54,78,43};
        for (int i = 0; i < w7array.length; i++){
            System.out.println("i= " + i +" : " +w7array[i] + " ");
        }

        int[] w7array1 = new int[30];
        String[] str = new String[20];
        boolean[] barray = new boolean[10];
        double darray[];

        //darray = new double[a];

        String ab = "[";
        for (int i = 0; i < w7array.length; i++){
            ab += String.format("%3d",w7array[i]);
        }
        ab += "]";

        System.out.println("[" +ab+"]");

        double sum = 0;
        for (int i = 0; i < w7array.length; i++) {
            sum += w7array[i];
            w7array[i] = w7array[i]*2/4;

        }
        System.out.println("Sum is = " +sum);
        System.out.println(Arrays.toString(w7array));


    }

}
