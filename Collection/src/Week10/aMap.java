package Week10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class aMap {

    public static void main(String[] args) {
        Random rnd = new Random();
        Map<String, Integer> amap = new HashMap<>();
        TreeMap<String, Integer> bmap = new TreeMap<>();

        for(int i = 0; i < 5; i++){
            amap.put("A" + i,rnd.nextInt(101));
            bmap.put("A" + i,rnd.nextInt(101));
        }
        System.out.println("HashMap: " + amap);
        System.out.println("TreeMap: " + bmap);

        amap.put("A0", 98);
        System.out.println("HashMap: " + amap);

    }
}
