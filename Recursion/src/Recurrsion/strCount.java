package Recurrsion;

public class strCount {

    public static int strCount(String str, String sub){
        int idx = str.indexOf(sub);
        if ((str.length() == 0) || (str == null)){
            return 0;
        }
        if (idx != -1)
            return 1 + strCount(str.substring(idx+sub.length()), sub);
        else
            return 0;
    }


    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "abc";

        int ind = s1.indexOf(s2);
        String sub = s1.substring(2);
        System.out.println(ind);
        System.out.println(sub);

        int i = s1.indexOf("d");
        System.out.println(i);

        System.out.println(strCount("LLOLLOLOLL", "LOL"));




    }
}
