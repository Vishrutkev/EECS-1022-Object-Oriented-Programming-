package Final;

import java.util.ArrayList;
import java.util.List;

public class Practise {
    int x = 5;
        // primitive datatype starts with lowercase
        // Non-primitive datatype starts with upperCase
        // The size of a primitive type depends on the data type, while non-primitive types have all the same size.

        // a class is a template for objects, and an object is an instance of a class.
        // an object is created from a class

        // The dot (.) is used to access the object's attributes and methods.
        //To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).

    public static void myPublicMethod() {

        System.out.println("Public methods must be called by creating objects");
    }

    String zipZap(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || i == s.length()-1 || !(s.charAt(i-1) == 'z' && s.charAt(i+1) == 'p')) {
                result += s.charAt(i);
            }
        }
        return result;
    }


    public static void main(String[] args){
        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);

        System.out.println("------------------------------");

        long sd = 922337208989L;
        System.out.println(sd);
        float dc  = 9.99999999999999999999999999999999999999999999999f;

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        System.out.println("------------------------------");

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        System.out.println("-------------Casting-----------------");

        double fv = 5.32;
        double fds = 6.43;
        double  ds = (int) fv ;
        System.out.println(ds);

        System.out.println("---------------String---------------");

        String firstName = "John \'";
        String lastName = "Doe\'";
        System.out.println(firstName.concat(lastName));

        System.out.println("---------------do-While---------------");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 2);
        Practise obj = new Practise();
        myPublicMethod();

         List<String> abc = new ArrayList<>();
         abc.add("asd");
        System.out.println(abc);

        double pi = 3.1432423;
        int d = 10;
        double asd = 4.6;
        int a = (int) (asd *10+ 4.9);
        System.out.println(a/10);
//        String s = String.format("%.3f",pi);
//        String sds = String.format("%-10d",d);
//        System.out.println(s);
//        System.out.println(sds);
//
//        String b = "book";
//        String b1 = "bookcase";
//        System.out.println(b1.compareTo(b));





    }
}
