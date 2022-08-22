package Recurrsion;

public class count7 {

    public static int count7rec(int n){
        if (n < 7){
            return 0;
        } else if (n == 7){
            return 1;
        } else if (n%10 == 7){
            return 1 + count7rec(n/10);
        } else {
            return count7rec(n/10);
        }
    }

    public static int count7iter(int n){
        int count = 0;
       while (n > 0){
           if (n % 10 == 7){
               count++;
           }
           n = n/10;
       }
       return count;
    }

    public static void main(String[] args) {

        System.out.println(count7iter(100377877));
        System.out.println(count7rec(777));

    }
}
