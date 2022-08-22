package Arayy;

public class Myclass {
    public static void showArray(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void swap(int[] source){
        if (source != null && source.length == 2){
            int temp = source[0];
            source[0] = source[1];
            source[1] = temp;
        }

    }

    public static boolean equals(int[] a, int[] b){
        boolean match = false;
        if (a.length == b.length){
            match = true;
            int i =0;
            while (match && (i<a.length)){
                if(a[i] != b[i]){
                    match = false;
                    i++;
                }
            }
        }

        return match;
    }

    public static double compAvg(int[] arry){
        int sum = 0;
        for (int i = 0; i <= arry.length-1; i++){
            sum += arry[i];
        }

        return (double) sum/arry.length;
    }




    public static void main(String[] args) {
        char[] grades = new char[45];
        Myclass.showArray(grades);
        int num[] = {1,2};
        System.out.println(" ");
        System.out.println("Before swap: " + num[0] + ", " + num[1]);
        swap(num);
        System.out.println("After swap: " + num[0] + ", " + num[1]);

        int[] number = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Myclass.compAvg(number));

        int[] a = {1,2,3,4};
        int[] b = {1,2,3,4};
        System.out.println(Myclass.equals(a,b));
    }


}
