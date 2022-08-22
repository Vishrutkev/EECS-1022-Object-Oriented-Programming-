package Recurrsion;

public class array6 {

    public static boolean aarray6(int[] nums, int index){
        if (nums.length == 0){
            return false;
        } else if (nums[index] == 6){
            return true;
        } else if (index +1 < nums.length)
            return aarray6(nums, index+1);
        else
            return false;
    }

    public static void main(String[] args) {

    }
}
