package Week10;

import java.util.*;

public class aSet {

    public static void main(String[] args) {
        List<String> alist = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            alist.add("A" + i);
            alist.add(0, "A" + i);
        }
        System.out.println(alist);

        Set<String> aset = new HashSet<>();
        for (String s : alist)
            aset.add(s);
        Set<String> bset = new TreeSet<>(alist);
        System.out.println("HashSet: " + aset);
        System.out.println("TreeSet: " + bset);

    }
}
