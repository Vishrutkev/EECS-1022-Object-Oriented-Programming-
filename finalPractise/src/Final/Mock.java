package Final;

import java.util.ArrayList;


public class Mock {

    public int close10(int a, int b) {
        if (Math.abs(10-a) < Math.abs(10-b)){
            return a;
        } else {
            return b;
        }
    }

    public String stringX(String str) {

        if (str.indexOf("x") == -1){
            return str;
        }
        String ans = "";
        if ((str.indexOf("x") == 0) && (str.indexOf("x") == str.length())){

        }
        return str;
    }






    static boolean doubleX(String str) {
        if (str.contains("xx")) {
            for (int i = 0; i < str.length(); i++) {
                int idx = str.indexOf("x");
                    if (str.charAt(idx) == (str.charAt(idx+1))){
                        return true;
                    }
            }

        }
        return false;
    }



    public static void cobbleArrays(ArrayList<Integer> a1, ArrayList<Integer> a2) {

        a2 = a1;
        a2.add(new Integer(42));
        a1 = new ArrayList<Integer>();
        a1.add(new Integer(41));
        System.out.println(a1);
        System.out.println(a2);
    }


    public static void main(String args[]) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a1.add(new Integer(10));
        a1.add(new Integer(4));
        a2.add(new Integer(7));
        a2.add(new Integer(9));
        a2.add(new Integer(11));
        cobbleArrays(a1, a2);

        System.out.println("Contents of a1: ");
        for(int i = 0; i < a1.size(); i++)
            System.out.println(a1.get(i));

        System.out.println("Contents of a2: ");
        for(int i = 0; i < a2.size(); i++)
            System.out.println(a2.get(i));


        System.out.println((float)5/2);
        System.out.println((double)(5/2));
        System.out.println((int)(5/2));


        System.out.println(doubleX("xaxxx"));

        String a = "dasd";
        System.out.println(a.charAt(0));
//        a = a.replace("a","");
//        System.out.println(a);
        String ab = "axxxsxd";
        System.out.println(ab.indexOf("d"));
    }



}
