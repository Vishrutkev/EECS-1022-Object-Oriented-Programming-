package NestedLoops;

public class forLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + ".");
            }
            System.out.println();

        }

        for (int k = 3; k >= 0; k--) {
            System.out.println();
            for (int l = k ; l >= 1; l--) {
                System.out.print("*" + ".");

            }
            System.out.print("*" + ".");

        }
        System.out.println();
        System.out.println("-----------------");
        int T = 0;
        for (int n = 0; n <= 4; n++) {
            for (int k = 1; k < 2*n; k+=2){
                T += k*n;
            }
            System.out.println("T = "+T);


        }

    }


}