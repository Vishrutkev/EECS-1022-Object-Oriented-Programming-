package Final;

import java.util.Arrays;

public class recurrrsive {

    static boolean isSorted(int[] input) {
        return helper(input, 0, input.length-1); }


    public static boolean helper(int[] input, int start, int end) {
        if (start == end) {
            return true; }
        int mid = (start + end) / 2;
        return helper(input, start, mid) && helper(input, mid+1, end);
    }

    public static boolean checkarr(int[] a){
        int num = a.length;
        if ((a.length == 1)){
            return true;
        } else {
            int[] ans = new int[a.length - 1];
            for (int i = 1; i < a.length; i++) {
                ans[i-1] = a[i];
            }
            boolean checkAns = checkarr(ans);
            if (!checkAns){
                return false;
            }else if (a[0] <= a[1]){
                return true;
            }else{
                return false;
            }


        }
    }

    public static String reverse(String s){
        if (s.length() == 1){
            return s;
        } else{
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }

    public static int count(String s, char c){
        if (s.length() == 0){
            return 0;
        }else{
            char head = s.charAt(0);
            String tail = s.substring(1,s.length());
            if (head == c){
                return 1 + count(tail, c);
            }else{
                return count(tail, c);
            }
        }
    }

    public static String sub(String str, int s, int e){
        return str.substring(s,e);
    }

    public static String even(String str) {
        if (str.length() == 0) {
            return "";
        } else if ((str.length() == 1) || (str.length() == 2)) {
            return str.charAt(0) + "";

        } else if (str.length() == 3) {
            return str.substring(0,1) + str.charAt(2);
        } else {
            String ns = str.substring(4, str.length());
            return str.charAt(0) + str.substring(2, 3) + even(ns);
        }
    }

    public static int[][] rect(int[][] a){
        int row = a.length;
        int col = a[0].length;
        int[][] ans = new int[col][row];
        int num = 0;

        for (int i = row; i >= 0 ; i--) {
            for (int j = 0; j < col-1; j++) {
                ans[num][j] = a[j][i];
            }
            num++;
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] a = {1,2,7,3};
        System.out.println(isSorted(a));

        String s = "siitriing";
        System.out.println(reverse(s));

        System.out.println(count(s,'i'));

        int[] abc = {1,2,3,4,5,0};
        System.out.println(checkarr(abc));

        String str = "ABCDEFG";
        System.out.println(even(str));

        int[][] arr = {{1,2,3},
                    {4,5,6}};

        System.out.println(Arrays.deepToString(rect(arr)));



    }
}
