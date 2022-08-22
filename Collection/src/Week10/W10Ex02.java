package Week10;

import java.util.ArrayList;

public class W10Ex02 {

    public static void main(String[] args) {
        // one-Dimension Array
         int[] a = {1,2,3,4,5,6,7,8};
         ArrayList<Integer> yorkulist = new ArrayList<>();
         for (int e : a){
             yorkulist.add(0,e);
         }
        System.out.println(yorkulist);
         yorkulist.remove(new Integer(3));
        System.out.println(yorkulist);
    }
}
