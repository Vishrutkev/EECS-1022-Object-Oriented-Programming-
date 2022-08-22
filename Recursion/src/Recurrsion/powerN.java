package Recurrsion;

public class powerN {

    public static int powerRec(int base, int n){
        if (n <= 0){
            return 1;
        } else
            return base * powerRec(base, n-1);
    }

    public static void main(String[] args) {
        System.out.println(powerRec(2,2));

    }
}
