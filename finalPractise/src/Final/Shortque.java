package Final;

import java.util.ArrayList;
import java.util.List;

public class Shortque {

    public static List<Integer> mystery(List<Integer> nums) {
        for (int k = 0; k < nums.size(); k++) {
            if (nums.get(k).intValue() == 0) {
                nums.remove(k);
            }
        }
        return nums;

}



    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i ; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
//        int i = 1;
//        for (int a = 2; a <= i; a++)
//            for (int b = 1; b < i; b++)
//                System.out.println("*");

        String str = "012345";
        for (int i = 0; i < str.length() - 1; i++) {
            System.out.print(str.substring(i, i+2));
        }





    }


}
