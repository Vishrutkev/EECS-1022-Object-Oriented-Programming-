package LAb;

import java.util.*;

public class Lab6 {

    private double x;
    private double y;

    public Lab6(){
    }

    public Lab6(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }


    public static boolean isPalindrome(int x) {
        String ans = String.valueOf(x);
        StringBuilder reverse = new StringBuilder();
        int before = ans.length() - 1;
        int after = ans.length();
        for (int i = 0; i < ans.length(); i++) {
            reverse.append(ans, before--, after--);
        }

        return (ans.equals(reverse.toString()));
    }

    public static int romanToInt(String s) {
        String roman = "";
        int num = 0;
        int result = 0;

        int before = 0;
        int after = 1;
        String first = s.substring(before, after);
        for (int i = 0; i <= (s.length() / 2) - 2; i++) {
            roman = first;

            if (first.length() == 2) {
                String f = first.substring(0, 1);
                String l = first.substring(1, 2);
                roman = f;


            }

            if (roman.equals("V")) {
                num = 5;
            }
            if (roman.equals("X")) {
                num = 10;
            }
            if (roman.equals("L")) {
                num = 50;
            }
            if (roman.equals("C")) {
                num = 100;
            }
            if (roman.equals("D")) {
                num = 500;
            }
            if (roman.equals("M")) {
                num = 1000;
            }

            int fnum = num;
            int lnum = num;
            num = lnum - fnum;


            result += num;

            first = s.substring(before++, after += 2);
        }

        return result;

    }


    public static int fractional(int num) {
        int result = 0;
        if (num == 1) {
            return 1;
        } else {
            return num * fractional(num - 1);
        }
    }

    public static double exponent(double num, int power) {
        if (power < 0){
            throw new IllegalArgumentException();
        }
        if (power == 0){
            return 1;
        }
        if (power == 1) {
            return num;
        } else {
            return  (num * exponent(num, power - 1));
        }


    }

    public static double taylor(double angle) {
        double result = 0;
        int sign = 1;

        for (int i = 1; i <= 12; i += 2) {
            result += (sign) * (exponent(angle, i) / fractional(i));
            sign *= -1;
        }

        String res = String.format("%1.2f", result);
        result = Double.parseDouble(res);
        return result;
    }


    public static String[] prefix(int[] a) {
        String[] ans = new String[a.length];
        String temp;
        temp = "[" + a[0];
        ans[0] = temp + "]";
        for (int i = 1; i < a.length; i++) {
            temp += ", " + a[i];
            ans[i] = temp + "]";
        }
        return ans;
    }

    public static double[][] multiply(double[][] m1, double[][] m2) {
        //TODO
        double num = 0;
        double[][] result = new double[3][3];
        for (int row1 = 0; row1 < 3; row1++) {

            for (int column1 = 0; column1 < 3; column1++) {
                num = 0;
                for (int k = 0; k < 3; k++) {
                    num += (m1[row1][k] * m2[k][column1]);
                }

                result[row1][column1] = num;
            }

        }
        return result;
    }

    public static double[] multiplyv(double[][] m, double[] v) {
        //TODO

        double num = 0.0;
        double[] result = new double[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                result[i] += (m[i][j] * v[j]);


            }

        }

        return result;
    }


    public static String[] getAllPrefixes(int[] numbers) {
        String[] result = null;

        /* Your implementation of this method starts here.
         * Recall from Week 1's tutorial videos:
         * 1. No System.out.println statements should appear here.
         * 	  Instead, an explicit, final `return` statement is placed for you.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */

        String[] prefixes = new String[numbers.length];
        String prefixSoFar = "[" + numbers[0];
        prefixes[0] = prefixSoFar + "]";
        for (int i = 1; i < numbers.length; i++) {
            prefixSoFar += ", " + numbers[i];
            prefixes[i] = prefixSoFar + "]";
        }

        //result = prefixes;

        /* TODO: Your implementation ends here. */

        return prefixes;
    }

    public static int[][] edgeDetection(int[] imageData, int width) {

        int arrLengthe = imageData.length / width;
        int[][] tempArrye = new int[arrLengthe][width];
        int[][] result = new int[arrLengthe][width];
        double output = 0;
        int[][] kernel = {{0, -1, 0},
                {-1, 5, -1},
                {0, -1, 0}};
        int num = 0;

        int counte = 0;
        for (int i = 0; i < arrLengthe; i++) {
            for (int j = 0; j < width; j++) {
                tempArrye[i][j] = imageData[counte++];
            }
        }


        System.out.println(Arrays.deepToString(tempArrye));


        int[] outputArry = new int[imageData.length];
        for (int i = 0; i < tempArrye.length; i++) {
            for (int j = 0; j < tempArrye[i].length; j++) {

                output = 0;

                int red = 0;
                double kernelred = 0;
                for (int ki = 0; ki < kernel.length; ki++) {
                    for (int kj = 0; kj < kernel[ki].length; kj++) {


                        int numX = j + kj - ((kernel.length) / 2);
                        int numY = i + ki - ((kernel.length) / 2);

                        if (numX < 0 && numY < 0) {
                            numX = 0;
                            numY = 0;
                        }

                        if (numY < 0) numY = 0;
                        if (numX < 0) numX = 0;

                        if (numX > tempArrye[0].length) numY = tempArrye[i].length - 1;
                        if (numY > tempArrye[0].length) numX = tempArrye[i].length - 1;
                        if (numY > arrLengthe) numY = arrLengthe - 1;
                        if (numX > arrLengthe) numX = arrLengthe - 1;

                        if (numX >= 0 && numX < width && numY >= 0 && numY < arrLengthe) {
                            red = (tempArrye[numY][numX]);

                            kernelred = kernel[ki][kj] * red;

                            int redv = (int) kernelred;

                            output += redv;


                        }

                    }

                }

                outputArry[num++] += output;

            }
        }

        int county = 0;
        for (int i = 0; i < arrLengthe; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = outputArry[county++];
            }
        }

        return result;

    }

    public static double dotProduct(double[] v1, double[] v2) {
        //TODO
        double result = 0;
        for (int i = 0; i < 3; i++) {
            result += (v1[i] + v2[i]);
        }
        return result;
    }

    public static boolean isPalidrom(String s) {
        if ((s.length() == 0) || (s.length() == 1)) {
            return true;
        } else {
            char first = s.charAt(0);
            char last = s.charAt(s.length() - 1);
            return (first == last) && isPalidrom(s.substring(1, s.length() - 1));

        }

    }

    public static String Reverse(String s) {
        String result = "";
        if (s.length() == 0) {
            return "";
        } else if (s.length() == 1) {
            result = s;
        } else {
            result += s.substring(s.length() - 1);
        }
        return result + Reverse(s.substring(0, s.length() - 1));
    }

    public static int Occurence(String s, char c) {
        int result = 0;
        if (s.length() == 0) {
            return 0;
        } else {
            if (s.charAt(0) == c) {
                result = 1;
            }
            return result + Occurence(s.substring(1), c);
        }
    }


    public static boolean isSorted(int[] a) {
        return helper(a, 0, a.length - 1);
    }

    public static boolean helper(int[] a, int from, int to) {
        if (from == to) {
            return true;
        } else if (from > to) {
            return true;
        } else {
            return (a[from] <= a[from + 1]) && helper(a, from + 1, to);
        }
    }

    public static void triangle(int num) {
        if (num == 1) {
            System.out.println("*");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }

            System.out.println();
            triangle(num - 1);

        }

    }


    public static <T extends Comparable<? super T>> void minToFront(List<T> list) {

        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }

        if (list.size() < 2) {
            return;
        }
        Lab6.minToFront(list.subList(1, list.size()));
        T first = list.get(0);
        T second = list.get(1);
        if (second.compareTo(first) < 0) {
            list.set(0, second);
            list.set(1, first);
        }
    }

    public static <T extends Comparable<? super T>> void selectionSortRecursive(List<T> list) {
        //TODO implement the recursive solution

        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (list.size() < 2) {
            return;
        }

        Lab6.minToFront(list);
        Lab6.selectionSortRecursive(list.subList(1, list.size()));


    }

    public static int add(int num) {
        if (num == 1) {
            return 1;
        } else {
            return 2 * add(num - 1);
        }
    }

    public int six(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                result = i;
            }
        }
        return result;
    }

    public static int sum67(int[] nums) {
//        int result = 0;
//        for (int i = 0; i < nums.length; i++){
//            if ((nums[i] == 6) || (nums[i] ==7)){
//                for (int j = i; j < nums.length; j++){
//                    if (nums[j] == 7){
//                        i = j;
//                    }
//                }
//            }
//           result += nums[i];
//        }
//        return result;

        boolean record = true;
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                record = false;
            }
            if (record) {
                total += nums[i];
                continue;
            }

            if (nums[i] == 7) {
                record = true;
            }
        }

        return total;

    }


    public boolean haveThree(int[] nums) {
        int count3 = 0;

        if (nums.length >= 1 && nums[nums.length - 1] == 3) {
            count3++;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == 3) && (nums[i + 1] == 3)) {
                return false;
            }

            if (nums[i] == 3) {
                count3++;
            }
        }

        return (count3 == 3);
    }


    public int[] zeroMax(int[] nums) {
        int odd = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length; j++) {
                    if ((nums[j] % 2 == 1)) {
                        odd = nums[j];
                        break;
                    } else {
                        odd = 0;
                    }

                }
                max = odd;
                nums[i] = max;
            }
        }
        return nums;
    }

    public static int[] squareUp(int n) {
        int[] result = new int[n * n];
        int idx = result.length - 1;
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1)
                    continue;
                result[i * n + j] = n - j;
            }

        }

        return result;
    }


    public int countHi(String str) {
        if (str.length() <= 1) {
            return 0;
        } else {
            if (str.startsWith("hi")) {
                return 1 + countHi(str.substring(2));
            }
        }
        return countHi(str.substring(2));

    }

    public String parenBit(String str) {
        if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        }

        if (str.charAt(str.length() - 1) != ')') {
            return parenBit(str.substring(0, str.length() - 1));
        }
        return str;
    }

    public boolean nestParen(String str) {
        if (str.length() == 0) {
            return true;
        }

        if (((str.charAt(0) == '(') & (str.charAt(str.length() - 1) == ')'))) {
            return true && nestParen(str.substring(1, str.length() - 1));
        }

        return false;

    }

    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }

        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }

        return strCount(str.substring(1), sub);
    }

    public static boolean strCopies(String str, String sub, int n) {

        if (str.length() < sub.length()) {
            return (n <= 0);
        }

        if (str.startsWith(sub)) {
            n--;
            System.out.println(n);
            return strCopies(str.substring(1), sub, n);
        }

        return strCopies(str.substring(1), sub, n);
    }


    public boolean array220(int[] nums, int index) {
        if (nums[index] == nums[nums.length - 1]) {
            return false;
        }

        if (nums[index] * 10 == nums[index + 1]) {
            return true;
        }
        return array220(nums, index + 1);
    }

    public static double getSine(double x) {
        double result = 0;
        double term = x;

        result = x;
        for (int i = 3, j = -1; i < 100000000; i = i + 2, j = j * -1) {
            term = x * x * term / (i * (i - 1));
            result = result + term * j;
        }

        return result;
    }


    public static void main(String[] args) {

//        double[][] m1 = {{10,20,10},{4,5,6},{2,3,5}};
//        double[][] m2 = {{3,2,4},{3,3,9},{4,4,2}};
//
//        double[][] m = {{1,2,3}, {4,5,6}, {7,8,9}};
//        double[] v = {2,1,3};
//
//
//        System.out.println(Arrays.deepToString(multiply(m1, m2)));
//        System.out.println(Arrays.toString(multiplyv(m, v)));
//
//        System.out.println(0/0.0);
//        System.out.println(2.0/0);
//
//        Lab6 d = new Lab6();
//        System.out.println(d.c);
//
//         String p1 = new String("Heeyeon");
//         String p2 = new String("Jiyoon");
//         System.out.println(p1 == p2);
//
//        System.out.println(fractional(5));
         System.out.println(exponent(2,4));
//
        double pi = 3.141592653589793238;
        System.out.println("Sin pi: " + taylor(3 * pi / 2));

        System.out.println(getSine(pi));
//
//        System.out.println(isPalindrome(1221));
//
//        System.out.println(romanToInt("MCMXCIV"));
//
////        int count=1;
////        for(; count<=100;){
////            System.out.println("WelcometoJava"+count+"!");
////            count++;/*count=count+1;*/ }
//
//        String $a = "asd";
//        System.out.println($a);
//
//        System.out.println("\n\"My name is Vish\"");
//
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        if (0 <  a && a < 10){
//            System.out.println(false);
//        } else {
//            System.out.println(true);
//        }
//
//        System.out.println(2.0 / 3  * 2);
//
//        int r = 12;
//        int q  = 0;
//        r = q;
//        System.out.println(r);
//
//        String ab = "abcd";
//        char y = ab.charAt(0);
//
//        String s = ab.substring(2);
//        System.out.println(s);
//
//        System.out.println(isPalidrom("mad3am"));

//        System.out.println(Reverse("abcg"));
//
//        System.out.println(Occurence("qw",'a'));
//
//        int[] a = {1,2,3,4,1};
//        System.out.println(isSorted(a));
//
//        triangle(10);
//
//        List<Integer> ac = new ArrayList<>();
//        ac.add(1);
//        ac.add(0);
//        ac.add(2);
//        ac.add(-5);
//        ac.add(3);
//        ac.add(2);
//        System.out.println(ac);
//        minToFront(ac);
//
//        System.out.println(ac);
//
//        selectionSortRecursive(ac);
//        System.out.println(ac);
//
//        System.out.println(add(10));

        int[] asd = {1, 6, 2, 2, 7, 1, 6, 99, 99, 7};
        System.out.println(sum67(asd));

        int a = 1200 - 10;
        Date dob = new Date();

        System.out.println(a);
        System.out.println(dob);

        System.out.println(Arrays.toString(squareUp(3)));

        System.out.println(strCount("x", "x"));

        System.out.println(strCopies("iiijjj", "ii", 2));

        Date dobs = new Date();
        System.out.println(dob.getTime());

        double f = 123425454654365656546124364314654654656.3435445487563454544356435697594658679538754;
        int s = 452346584;

        int c = 1000_134;

        long l = 21321l;
        double d = l;
        System.out.println(d);

        float as = 14325.2314F;
        int q = Float.floatToIntBits(as);

        System.out.println(0.0 / 1.0);
        System.out.println(q);

        Lab6 met = new Lab6(1, 2);
        System.out.println(met.getX());
        met = new Lab6(2, 2);
        System.out.println(met.getX());

       // met.x = 34;    will give an compilation  error because field ("x") is final;

        String s1 = "Vishrut Kevadiya";
        float d1 = 32.2382f;
        System.out.println(String.format("%10.3f", d1));
        Collection<String> sa = new ArrayList<>();
        sa.add(("Vish"));
        sa.add(("rut"));
        System.out.println(sa);

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        Set<String> keys = map.keySet();
        for (String k : keys) {
            Integer n = map.get (k);
            System.out.println(k + " occurs " + n + " times in t");
        }

        Collection<Integer> val = map.values();
        int num = 0;
        for (Integer i: val) {
            num = num + i;
        }
        double avg = num / map.keySet().size();

        System.out.println(avg);


        System.out.println(map.keySet());
        System.out.println(map.values());


//        List<Integer> de = new ArrayList<>();    // will get an IndexOutOfBoundsException
//        System.out.println(de.get(0));


        int[] az = {1,2,3};
        System.out.println(Arrays.toString(az));

        int[] t = Arrays.copyOf(az,3);
        System.out.println(Arrays.toString(t));

        System.out.println("Kevadiya \nVishrut");






    }
}
