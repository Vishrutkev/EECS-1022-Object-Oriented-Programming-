package String;

import java.util.Arrays;

public class method01 {

    protected method01(){
    }

    public static String zipZap(String str) {
        String ans = "";
        if (str.length() <= 2){
            return str;
        }
        else{
            for ( int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) == 'z') && (str.charAt(i + 2) == 'p')) {
                    ans += str.substring(i, i + 1) + str.charAt(i + 2);
                    i += 2;
                } else {
                    ans += str.charAt(i) + "";
                }
            }
        }
        return ans;
    }

    public static String wordEnds(String str, String word) {
        String ans = "";
        for (int i = 0; i < str.length()-1; i+= word.length()-1){
            if (str.substring(i, word.length()+i).equals(word)){
                ans += (str.substring(i-1,i) + str.charAt(i+word.length()) + "");
            }
        }
        return ans;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        for (int i = 0; i < 3; i++){
            if ((Math.abs(nums1[i]-nums2[i]) <= 2)) {

            }
        }
        return 0;
    }


    public boolean isEverywhere(int[] nums, int val) {
        int count = 0;
        int len = nums.length/2;
        for (int i = 0; i < nums.length-1; i++){
            if ((nums[i] == val) || (nums[i+1] == val)){
                count++;
            }
        }
        return ((len) == count);
    }




    public static void main(String[] args) {

        String s = "ABC";

        System.out.println(s.charAt(2));
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        String str = "zzzopzop";
        System.out.println(zipZap(str));
        System.out.println(wordEnds("abcXY123XYijk", "XY"));

        int ac = Math.abs(2-3);
        System.out.println(ac);

        int[][] acd = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int num = 0;
        int[] result = new int[12];
        for (int i = 0; i < acd.length; i++) {
            for (int j = 0; j < acd[i].length; j++) {
                result[num++] = acd[i][j];
            }
        }

        System.out.println(Arrays.toString(result));
        


    }
}
