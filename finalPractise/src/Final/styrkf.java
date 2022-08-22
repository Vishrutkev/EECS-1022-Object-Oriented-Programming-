package Final;

public class styrkf {


    public static boolean xyzMiddle(String str) {
        int countLeft = 0, countRight = 0;
        if (str.contains("xyz")) {
            int i = 0;
            while (i < str.length()) {
                if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z')
                    break;
                ++countLeft;
                i++;
            }
            System.out.println(countLeft);
            i = str.length() - 1;
            while (i >= 0) {
                if (str.charAt(i - 2) == 'x' && str.charAt(i - 1) == 'y' && str.charAt(i) == 'z')
                    break;
                ++countRight;
                i--;
            }
            System.out.println(countRight);
            return countLeft - countRight >= -1 && countLeft - countRight <= 1;
        }
        return false;
    }

    public static void main(String[] args) {
        //System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzxyzBB"));
        int num = 0;
        for (int i = -21; i < 1100; i += 3) {
            num++;
        }
        System.out.println(num);

        char[] names = {'A', 'B', 'C'};
        System.out.print("{");
        for (int i = 0; i < names.length; i++) {
            System.out.print(", ");
            System.out.print(names[i]);

        }
        System.out.print("}");

        System.out.println();

        int[][] twoD = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                if (j >= twoD[i].length - i) {
                    System.out.print(twoD[j][i]);
                } else {
                    System.out.println(" ");
                }
            }
        }
        int[][] ns = {{46, 13, 8, 33, 29}, {50, 15, 8, 35, 29}, {48, 13, 9, 34, 47}, {48, 15, 8, 34, 37}};
        boolean property = false;
        for (int i = 0; i < ns.length; i++) {
            for (int j = 0; j < ns[i].length; j++) {
                property = ns[i][j] % 7 == 0;
            }
        }
        System.out.println("At least one number is a multiple of 7: " + property);

        System.out.println(-146 % 7);
    }
}
