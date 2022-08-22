package Final;

import java.util.Arrays;

public class twoDArray {

    public static int[][] Arr2D(int[][] arr) {

        int row = arr.length;
        int col = arr[0].length;

        int[][] ans = new int[row + 2][col + 2];

        for (int i = 0; i < row; i++) {
            ans[i + 1][0] = 0;
            ans[i + 1][col+1] = 0;

            for (int j = 0; j < col; j++) {
                ans[i + 1][j + 1] = arr[row - i - 1][j];
            }
        }

        for (int i = 0; i < ans[0].length; i++) {
            ans[0][i] = 0;
            ans[ans.length - 1][i] = 0;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] a = new int[4][4];
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j >= i) {
                    a[i][j] = 1;
                    System.out.print(a[i][j]);

                }else{
                System.out.println(" "); }
            }
        }

        System.out.println(" ");

        int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
        int row = b.length;
        int col = b[0].length;
        int[][] ans = new int[row+2][col+2];
        for (int i = 0; i < b.length; i++) {
            for (int j = b[i].length-1; j >= 0; j--) {
                ans[i+1][j+1] = b[j][i];
            }

            }
        System.out.println(Arrays.deepToString(ans));



        int[][] arr = Arr2D(new int[][] {{1, 2, 3}, {4, 5, 6}});

            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; (arr[i] != null && j < arr[i].length); j++) {
                    System.out.print(arr[i][j] + " ");
                }

                System.out.println();
            }

            int[] abc = {1,2,3,4,5,6,7};
        System.out.println(abc[abc.length-1]);
        }

    }




