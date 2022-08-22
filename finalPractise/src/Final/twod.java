package Final;

import java.util.*;

public class twod {

    public static int findFactorial (int n)
    {
        int i, factorial = n;
        for (i = n -1 ; i >= 1; i--)
            factorial = factorial * i;
        return factorial;
    }

    public static void sor(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if (a[i] >= a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static boolean same(ArrayList<Integer> list1, ArrayList<Integer> list2){
        Set<Integer> list3 = new HashSet<>(list1);

        Set<Integer> list4 = new HashSet<>(list2);



        ArrayList<Integer> list5 = new ArrayList<>(list3);
        ArrayList<Integer> list6 = new ArrayList<>(list4);

        Collections.sort(list5);
        Collections.sort(list6);



        return list5.equals(list6);




//        for (int i = 0; i < list1.size(); i++) {
//            for (int j = 0; j < list2.size(); j++) {
//                if (list[i])
//            }
//        }

    }

    public static void main(String[] args) {
        int[][] a = new int[4][4];

        for (int i = 0; i < 4; i++) {
                a[i][0] = 9;
                a[i][3] = 9;
        }

        System.out.println(Arrays.deepToString(a));

        System.out.println(findFactorial(3));

        int[][] tw = {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        int m = tw.length;
        int n = tw[0].length;
        int[] ans = new int[16];
        int t = 0;
        int b = m-1;
        int l = 0;
        int r = n-1;
        int dir = 0;
        int num = 0;
        while((t <= b) && (l <= r)){
            if (dir == 0){
                for (int i = l; i <= r ; i++) {
                    ans[num++] = tw[t][i];
                    t++; dir = 1;

                }

            }
            if (dir == 1){
                for (int i = t; i <= b ; i++) {
                    ans[num++] = tw[i][r];
                    r--; dir = 2;
                }

            }
            else if (dir == 2){
                for (int i = r; i >= l ; i--) {
                    ans[num++] = tw[b][i];
                    b--; dir = 3;
                }

            }else if (dir == 3){
                for (int i = b; i >= t  ; i--) {
                    ans[num++] = tw[i][l];
                    l++; dir = 0;
                }


            }

        }

//        while (ans[ans.length-1] == tw[1][1]) {
//            int num = 0;
//            for (int i = 0; i < tw[0].length; i++) {
//                ans[num++] = tw[0][i];
//            }
//            for (int i = 1; i <= tw.length - 1; i++) {
//                ans[num++] = tw[i][tw[0].length - 1];
//            }
//            for (int i = tw.length - 1; (i >= 0); i--) {
//                ans[num++] = tw[tw.length - 1][i];
//            }
//            for (int i = tw.length - 2; i >= 1; i--) {
//                ans[num++] = tw[tw.length - 2][0];
//            }
//            for (int i = 2; i < tw[1].length - 1; i++) {
//                ans[num++] = tw[1][i];
//            }
//        }




        //System.out.println(Arrays.toString(ans));

        Random rand = new Random();
        int aq = rand.nextInt(10)+1;
        //System.out.println(aq);

        int[] aa = {1,3,4,2,9,8,6,9,};
        sor(aa);
        //System.out.println(Arrays.toString(aa));

        ArrayList<Integer> al = new ArrayList<>();
        al.add(2); al.add(3); al.add(1); al.add(4); al.add(1);

        Set s = new HashSet<>(al);
        //System.out.println(s);

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(2); al1.add(3); al1.add(1); al1.add(4); al1.add(3); al1.add(1); al1.add(4); al1.add(1);

        System.out.println(same(al,al1));










    }
}
