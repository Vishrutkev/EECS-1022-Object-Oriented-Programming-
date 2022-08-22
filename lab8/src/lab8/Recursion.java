package lab8;

/**
 * NOTE: You must NOT use any kind of LOOP (neither for-loop nor while-loop) in any task of this lab.
 * Violating this rule will result in a mark of zero.
 */
public class Recursion {

    /**
     * Given a positive integer number, return the result of log(number) base 22,
     * with result rounded down to the floor integer.
     */
    public static int logarithmBase22(long number) {
        if (number < 22)
            return 0;
        else
            return (1 + logarithmBase22((number) / 22));


        // TODO Task 1: implement this recursive method

    }

    /**
     * Return the number of occurrences of the substring "LOL" in the input string
     * <p>
     * Assumption: the inputStr consists of ONLY uppercase letter. It can be an empty string.
     * <p>
     * Read the JUnit test cases for detailed specification.
     */
    public static int countLOL(String inputStr) {
        int idx = inputStr.indexOf("LOL");
        if (inputStr.length() == 0)
            return 0;
        if (inputStr.contains("LOL"))
            return 1 + countLOL(inputStr.substring(idx + 2));
        else
            return 0;


        // TODO Task 2: Complete this recursive method.

    }

    /**
     * Given an array of numbers that follow an increasing-then-decreasing order
     * (including the cases of only-increasing and only-decreasing),
     * return the index of the peak (maximum) element.
     * <p>
     * Assumption:
     * - All numbers in the input array are distinct.
     * - The input array is non-empty.
     * <p>
     * Read the JUnit test cases for detailed specification.
     */
    public static int findPeakIndex(int[] numbers) {

        // Do NOT modify this method. Implement the helper method instead.
        return findPeakIndexHelper(numbers, 0, numbers.length - 1);
    }

    /**
     * Helper method for findPeakIndex
     */
    public static int findPeakIndexHelper(int[] numbers, int startIndex, int endIndex) {
        // TODO Task 3: Complete this recursive method.

        if (startIndex == endIndex) {
            return startIndex;
        } else if (numbers.length == 2) {
            if (numbers[startIndex] > numbers[startIndex + 1]) {
                return startIndex;
            } else {
                return endIndex;
            }

        } else {
            int mid = (startIndex + endIndex) / 2;
            if (numbers[mid] < numbers[mid+1]){
                return findPeakIndexHelper(numbers, mid+1, endIndex);
            }else{
                return findPeakIndexHelper(numbers, startIndex , mid);
            }
        }


    }

}

