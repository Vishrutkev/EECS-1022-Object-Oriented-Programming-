package Week10;

import java.util.*;

public class W10Ex01 {

    public static void main(String[] args) {
        Set <Character> aset = new HashSet<>();
        List <Integer> blist = new ArrayList<>(5);
        List<String> alist = new ArrayList<>(30);
        System.out.println("blist size: " + blist.size());
        System.out.println("alist size before : " + alist.size());

        alist.add("AAA");  alist.add("BBB");
        System.out.println("alist size after adding: " + alist.size());
        System.out.println("alist: " + alist);
        alist.add(0,"CCC");
        System.out.println("alist after adding one more element: " + alist);
        System.out.println(alist.get(2));
        alist.add("CCC");
        System.out.println(alist);
        alist.remove("AAA"); // It will remove first appearance of "AAA"
        System.out.println(alist);
    }
}
